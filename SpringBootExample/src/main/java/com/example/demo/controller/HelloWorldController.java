package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping("/helloworld")
    @ResponseBody
    public String helloworld(String name, HttpServletRequest request, HttpServletResponse response){
    	logger.info("welcome to HelloWorldController!");
        return "{\"controller\":\"HelloWorldController-" + name + "\"}";
    }
}
