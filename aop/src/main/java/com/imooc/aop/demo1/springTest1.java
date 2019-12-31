package com.imooc.aop.demo1;

import org.junit.Test;


public class springTest1 {

    @Test
    public void demo1(){

        UserDao userDao = new UserDaoImpl();

        UserDao proxy = (UserDao) new MyJdkProxy(userDao).createProxy();


        proxy.save();
        proxy.update();
        proxy.delete();
        proxy.find();



    }





}
