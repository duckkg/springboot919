package com.niu.springboot_9_19.service.Impl;

import com.github.pagehelper.PageHelper;
import com.niu.springboot_9_19.mapper.User_mapper;
import com.niu.springboot_9_19.pojo.User;
import com.niu.springboot_9_19.service.User_service;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class User_serviceImpl implements User_service {


    @Autowired
    private User_mapper user_mapper;

    @Override
    public User login(User user) {
        return user_mapper.login(user);
    }

    @Override
    public int register(User user) {
        user_mapper.register(user);
        return 0;
    }

    @Override
    public List list(List<String> strings,RowBounds rowBounds) {
        PageHelper.startPage(0,2);

        return user_mapper.list(strings,rowBounds);
    }
}
