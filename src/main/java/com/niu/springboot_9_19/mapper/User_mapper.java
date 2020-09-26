package com.niu.springboot_9_19.mapper;


import com.niu.springboot_9_19.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface User_mapper {
    public User login(User user);

    public void register(User user);

    public List<User> list(List<String> list, RowBounds bounds);
}
