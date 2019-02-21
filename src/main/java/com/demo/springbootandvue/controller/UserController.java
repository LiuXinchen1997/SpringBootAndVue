package com.demo.springbootandvue.controller;

import com.demo.springbootandvue.entity.User;
import com.demo.springbootandvue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get/{id}")
    public User findUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
}
