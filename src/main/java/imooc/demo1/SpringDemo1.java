package imooc.demo1;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class SpringDemo1 {
    @Test
    //传统模式
    public void demo1(){

        UserService us = new UserServiceImpl();
        us.sayHello();


    }
    //spring模式
    @Test
    public void demo2(){

            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

            UserService userService = (UserService) applicationContext.getBean("userServiceId");
            userService.sayHello();

    }

    @Test
    //读取磁盘中的配置文件
    public void demo3(){

        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("F:\\apache-maven-3.6.3\\conf\\settings.xml");

        UserService us = (UserService) applicationContext.getBean("userServiceId");

        us.sayHello();

    }

}
