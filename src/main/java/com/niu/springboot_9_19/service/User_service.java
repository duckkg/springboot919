package com.niu.springboot_9_19.service;


import com.niu.springboot_9_19.pojo.User;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface User_service {

    public User login(User user);

    public int register(User user);

    public List list(List<String> strings, RowBounds bounds);
}
