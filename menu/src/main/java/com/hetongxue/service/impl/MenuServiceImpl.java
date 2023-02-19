package com.hetongxue.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hetongxue.domain.Menu;
import com.hetongxue.repository.MenuRepository;
import com.hetongxue.service.MenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MenuServiceImpl extends ServiceImpl<MenuRepository, Menu> implements MenuService {

}




