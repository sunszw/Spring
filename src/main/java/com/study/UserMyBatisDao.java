package com.study;

import org.springframework.stereotype.Repository;

@Repository
public class UserMyBatisDao extends UserDAO {

    public void reg() {
        System.out.println("UserMyBatisDao.reg()");
    }
}
