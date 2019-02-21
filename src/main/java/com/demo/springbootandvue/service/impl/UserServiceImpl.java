package com.demo.springbootandvue.service.impl;

import com.demo.springbootandvue.dao.UserMapper;
import com.demo.springbootandvue.entity.User;
import com.demo.springbootandvue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
