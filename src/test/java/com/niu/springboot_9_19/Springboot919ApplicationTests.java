package com.niu.springboot_9_19;

import com.niu.springboot_9_19.pojo.User;
import com.niu.springboot_9_19.service.User_service;
import org.apache.ibatis.session.RowBounds;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class Springboot919ApplicationTests {

    @Autowired
    User_service user_service;
    @Test
    public void springTest1() {
        User user=new User("root","duck",12.36d,new Date());
        user_service.register(user);
    }

    @Test
    public void springTest2(){
        List<String> list=new ArrayList<>();
        list.add("duck");
        list.add("root");
        RowBounds rowBounds=new RowBounds(0,10);
        List list1 = user_service.list(list,rowBounds);
        System.out.println(list1);
    }
}
