package com.fish.reader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {
    @GetMapping("/test/t1")
    public ModelAndView test1(){
        return new ModelAndView("/test");
    }
    @GetMapping("/test/t2")
    @ResponseBody//测试json序列化输出，直接通过方法对外产生响应文本
    public Map test2(){
        Map result = new HashMap();
        result.put("test", "测试文本");
        return result;
    }
}