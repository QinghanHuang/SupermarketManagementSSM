package com.clement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Qinghan Huang
 * @Date 2023/5/26 23:00
 * @Desc
 * @Version 1.0
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
