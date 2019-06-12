package com.ssf.mysqloracletest.service;

import com.ssf.mysqloracletest.domain.User;

public interface UserService {
    public User selectByPrimaryKey(Integer id);
}
