package com.hetongxue.controller;

import com.hetongxue.domain.Menu;
import com.hetongxue.repository.MenuRepository;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 菜单处理程序
 *
 * @author 何同学
 */
@RestController
@RequestMapping("/menu")
public class MenuHandler {

    @Resource
    private MenuRepository menuRepository;
    @Value("${server.port}")
    private String port;


    @GetMapping("/index")
    public String index() {
        return "menu的端口：" + port;
    }

    @GetMapping("/findAll/{page}/{limit}")
    public List<Menu> findAll(@PathVariable("page") int page, @PathVariable("limit") int limit) {
        return menuRepository.findAll(page - 1, limit);
    }
}