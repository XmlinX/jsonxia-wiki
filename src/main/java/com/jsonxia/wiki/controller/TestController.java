package com.jsonxia.wiki.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: wiki
 * @Author xiameilin
 * @Created on 2023/1/16 下午10:07
 */


@RestController
public class TestController {


//    @GetMapping("/hello")
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello world 1";
    }
}
