package com.lxs.firstspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by: lxs
 * 2018/8/20 17:29
 */
@RestController
public class TestController {
    /**
     * test
     * @param str
     * @return
     */
    @RequestMapping("/test")
    public String getMsg(String str){
        return str;
    }

    /**
     * test
     * @param s
     * @param a
     */
    @RequestMapping("/test")
    public void getMsg1(String s,Integer a){
        System.out.println("dsad");
    }
}
