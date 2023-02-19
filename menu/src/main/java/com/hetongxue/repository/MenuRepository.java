package com.hetongxue.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hetongxue.domain.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends BaseMapper<Menu> {

    List<Menu> findAll(int page, int limit);

    int count();

    Menu findById(int id);

    int save(Menu menu);

    int update(Menu menu);

    int deleteById(int id);

}




