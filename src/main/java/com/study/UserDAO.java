package com.study;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("userDao1")
@Scope
@Lazy(true)
public class UserDAO {

    public UserDAO() {
        System.out.println("UserDao()");
    }

    public void init() {
        System.out.println("UserDao.init()");
    }

    public void destroy() {
        System.out.println("UserDao.destroy()");
    }

    public void reg() {
        System.out.println("UserDao.reg()");
    }

}