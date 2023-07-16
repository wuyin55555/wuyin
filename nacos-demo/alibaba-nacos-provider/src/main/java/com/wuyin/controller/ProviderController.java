package com.wuyin.controller;

import com.wuyin.config.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @Autowired
    private Hero hero;
    /**
     * 打招呼的接口
     *
     * @param name
     * @return
     */
    @GetMapping("hello")
    public String hello(String name) {
        return "hello:"+name;
    }

    @GetMapping("str")
    public String hello() {
        return hero.toString();
    }

}
