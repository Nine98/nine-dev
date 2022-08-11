package com.netease.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO description
 *
 * @author chenxueping02
 * @date 2022/07/28
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String test(){
        return "hello word";
    }
}
