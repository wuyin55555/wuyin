package com.wuyin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    /**
     * 打招呼的接口
     *
     * @param name
     * @return
     */
    @GetMapping("hello")
    public String hello(String name) {
        return "hello:"+name+"22222";
    }

}
