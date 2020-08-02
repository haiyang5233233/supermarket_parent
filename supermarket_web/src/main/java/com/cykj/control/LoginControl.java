package com.cykj.control;

import com.alibaba.fastjson.JSON;

import com.cykj.service.LoginService;
import com.cykj.supermarket_base.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/loginControl")
public class LoginControl {
    @Autowired
    public LoginService loginService;

    @RequestMapping(value = "/login")
    @ResponseBody
//    @Log(operationType = "操作",operationName = "管理员登录")
    //管理员登录
    public String login(String account,String pwd) throws IOException {

        Admin admin = new Admin();
        admin.setAccount(account);
        admin.setPwd(pwd);

         admin= loginService.login(admin);
        if (admin != null) {
            return "success";
        } else {
            return "error";
        }
    }
}
