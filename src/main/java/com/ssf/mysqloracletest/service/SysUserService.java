package com.ssf.mysqloracletest.service;

import com.ssf.mysqloracletest.domain.SysUser;

public interface SysUserService {

    public SysUser findByUsername(String username);
}
