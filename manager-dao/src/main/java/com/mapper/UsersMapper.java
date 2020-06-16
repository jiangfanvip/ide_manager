package com.mapper;


import jiangfan.pojo.Users;

import java.util.List;

public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
