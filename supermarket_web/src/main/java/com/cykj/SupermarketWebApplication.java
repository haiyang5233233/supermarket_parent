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
        admin.setCardId(11);
        System.out.println(admin.getAccount());

        System.out.println(admin.getCardId());
        SpringApplication.run(SupermarketWebApplication.class, args);
    }

}
