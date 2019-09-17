package com.example.exceptiontest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

public class BaseController {
    @ExceptionHandler(Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception{
        System.out.println("BaseController defaultErrorHandler()……");
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception",e);
        mav.addObject("url",req.getRequestURL());
        mav.setViewName("error");
        return mav;
    }
}
