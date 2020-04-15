package com.dzu.mapper;

import com.dzu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();

    //添加
    int addUser(User user);

    //删除
    int delUser(@Param("id") int id);
}
