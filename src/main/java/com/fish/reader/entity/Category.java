package com.fish.reader.entity;

import com.baomidou.mybatisplus.annotation.TableField;

/*图书分类实体*/
public class Category {
    private Long categoryId;
    @TableField("category_name")
    private String categoryName;

}
