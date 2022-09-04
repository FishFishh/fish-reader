package com.fish.reader.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fish.reader.entity.Test;

public interface TestMapper extends BaseMapper<Test> {
    public void insertSample();
}
