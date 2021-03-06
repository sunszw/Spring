package com.study;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiredByName {
    private ClassPathXmlApplicationContext classPathXmlApplicationContext;

    @Before
    public void init() {
        classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext1.xml");
    }

    @After
    public void destroy() {
        classPathXmlApplicationContext.close();
    }

    @Test
    public void testAutowiredByName(){
        Worker worker=classPathXmlApplicationContext.getBean("worker",Worker.class);
        worker.work();
    }
}
