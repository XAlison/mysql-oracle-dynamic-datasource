package com.ssf.mysqloracletest.mapper;


import com.ssf.mysqloracletest.domain.SysUser;

import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(Integer id);
    
    SysUser findByUsername(String username);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);
}