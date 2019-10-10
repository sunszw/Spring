package com.study;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

public class TestCase {
    private ClassPathXmlApplicationContext classPathXmlApplicationContext;

    @Before
    public void init() {
        classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @After
    public void destroy() {
        classPathXmlApplicationContext.close();
    }

    @Test
    public void TestHello() {
        HelloSpring helloSpring = classPathXmlApplicationContext.getBean("hello", HelloSpring.class);
        System.out.println(helloSpring);
    }

    @Test
    public void testDI(){
        Worker worker=classPathXmlApplicationContext.getBean("worker",Worker.class);
        worker.work();
    }

    @Test
    public void TestBaseType(){
        BaseType baseType=classPathXmlApplicationContext.getBean("base",BaseType.class);
        System.out.println(baseType);
    }

    @Test
    public void testComplexType(){
        ComplexType complexType=classPathXmlApplicationContext.getBean("complex",ComplexType.class);
        System.out.println(complexType);
    }

    @Test
    public void testProperties(){
        Properties jdbc=classPathXmlApplicationContext.getBean("properties",Properties.class);
        System.out.println(jdbc);
    }

    @Test
    public void testJdbc(){
        JdbcBean jdbcBean=classPathXmlApplicationContext.getBean("jdbc",JdbcBean.class);
        System.out.println(jdbcBean);
    }

}
