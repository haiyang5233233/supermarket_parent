package com.cykj.service.impl;


import com.cykj.mapper.LoginMapper;
import com.cykj.service.LoginService;
import com.cykj.supermarket_base.model.Admin;
import com.cykj.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;
    @Override
    public Admin login(Admin userAdmin) {
        String pwd = userAdmin.getPwd();
        userAdmin.setPwd(MD5Util.md5(pwd));
        System.out.println("转换后：" + userAdmin.getAccount() + userAdmin.getPwd());
        Admin admin = null;
        admin = loginMapper.login(userAdmin);
        return admin;
    }

}
