package com.ssf.mysqloracletest.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.ssf.mysqloracletest.domain.User;
import com.ssf.mysqloracletest.mapper.UserMapper;
import com.ssf.mysqloracletest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("mysql")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
