package com.study;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowired {

    @Test
    public void run() {

        System.out.println("准备读取Spring配置文件……");
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
        System.out.println("读取Spring配置文件结束");

        // 2. 从Spring容器中获取对象
        System.out.println("准备从Spring容器中获取对象……");
        // UserDao userDao1 = ac.getBean("userDao", UserDao.class);
        // UserDao userDao2 = ac.getBean("userDao", UserDao.class);
        UserServlet userServlet = classPathXmlApplicationContext.getBean("userServlet", UserServlet.class);
        System.out.println("从Spring容器中获取对象结束");

        // 3. 测试使用
        System.out.println("准备测试使用……");
        // System.out.println(userDao1);
        // System.out.println(userDao2);
        // System.out.println(userServlet);
        userServlet.reg();
        System.out.println("测试使用结束");

        // 4. 关闭/释放资源
        System.out.println("准备释放资源……");
        classPathXmlApplicationContext.close();
        System.out.println("释放资源结束");
    }
}
