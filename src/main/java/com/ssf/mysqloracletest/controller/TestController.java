package com.ssf.mysqloracletest.controller;

import com.ssf.mysqloracletest.domain.SysUser;
import com.ssf.mysqloracletest.domain.User;
import com.ssf.mysqloracletest.service.SysUserService;
import com.ssf.mysqloracletest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    UserService userService;

    @Autowired
    SysUserService sysUserService;
    @PostMapping("/mysql/{id}")
    public User testMysql(@PathVariable("id") Integer id){
        return userService.selectByPrimaryKey(id);
    }

    @PostMapping("/oracle/{name}")
    public SysUser testOracle(@PathVariable("name") String name){
        return sysUserService.findByUsername(name);
    }
}
