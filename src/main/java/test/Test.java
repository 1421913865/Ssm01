package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class Test {
    @org.junit.Test
    public void run(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
       UserService us= (UserService) ac.getBean("userService");
       us.findall();
    }
}
