package com.hetongxue.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@TableName("t_menu")
public class Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * ID
     */
    private Integer id;
    /**
     * 菜单名
     */
    private String name;
    /**
     * 价格
     */
    private BigDecimal price;
    /**
     * 口味
     */
    private String flavor;
    /**
     * 类型ID
     */
    private Integer tid;

}