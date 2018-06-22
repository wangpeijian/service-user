package com.org.serviceuser.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by wangpeijian on 2018/6/21.
 */
@RequestMapping("user")
@RestController
public class User {

    @RequestMapping("hello")
    public String index(@RequestParam String name) throws Exception {
        throw new Exception("asdasd");
//        return String.format("hello word %s", name);
    }
}
