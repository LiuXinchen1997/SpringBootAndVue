package com.demo.springbootandvue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLController {

    @RequestMapping(value = "/mainpage")
    public String getmainpage() {
        return "index";
    }
}
