package com.ssf.mysqloracletest.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.ssf.mysqloracletest.domain.SysUser;
import com.ssf.mysqloracletest.mapper.SysUserMapper;
import com.ssf.mysqloracletest.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@DS("oracle")
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;
    @Override
    public SysUser findByUsername(String username) {
        return sysUserMapper.findByUsername(username);
    }
}
