package com.jiangfan.service.Impl;


import com.jiangfan.service.UsersService;
import com.mapper.UsersMapper;
import jiangfan.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

     public void addUser(Users users) {

        this.usersMapper.insertUser(users);
    }
}
