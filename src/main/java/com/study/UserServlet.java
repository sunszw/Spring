package com.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServlet {

    @Autowired
    public UserDAO userDao1;

    public void reg() {
        System.out.println("UserServlet.reg()");
        userDao1.reg();
    }

}
