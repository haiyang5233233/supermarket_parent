package com.cykj.mapper;


import com.cykj.supermarket_base.model.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    //管理员登录
    Admin login(Admin admin);
}
