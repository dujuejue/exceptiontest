package com.example.exceptiontest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() throws Exception{
        //抛出异常
        throw new Exception();
    }

    @RequestMapping("/test")
    public String test()throws Exception{
        System.out.println("test()……");
        //模拟异常
        int i = 5/0;
        return "success";
    }
    @ExceptionHandler(Exception.class)
    public String testErrorHandler(Exception e){
        System.out.println("TestController testErrorHandler()……");
        return "服务器故障，请联系管理员。";
    }

}
