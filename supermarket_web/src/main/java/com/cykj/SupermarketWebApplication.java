package com.cykj;

import com.cykj.supermarket_base.model.Admin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SupermarketWebApplication {

    static Admin admin;
    public static void main(String[] args) {
        admin=new Admin();
        admin.setAccount("zhaohy");
        System.out.println(admin.getAccount());
        SpringApplication.run(SupermarketWebApplication.class, args);
    }

}
