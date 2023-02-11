package com.jsonxia.wiki.controller;


import org.springframework.beans.factory.annotation.Value;
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
public class HelloController {

    @Value("${test.hello:lao-ba}")
    private String str;


    @GetMapping("/hello")
    public String hello(){
        return "hello world !";
    }

    @RequestMapping(value="/v2/hello",method = RequestMethod.GET)
    public String helloV2(){
        return str;
    }


}
