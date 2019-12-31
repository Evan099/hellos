package imooc.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest2 {
    String appxml = "applicationContext.xml";
    @Test
    public void demo1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(appxml);

        Bean1 bean1 = (Bean1) applicationContext.getBean("Bean1");

        bean1.say();

        applicationContext.close();

    }

    @Test
    public void demo2(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(appxml);

        Bean2 bean1 = (Bean2) applicationContext.getBean("Bean2");
        Bean2 bean2 = (Bean2) applicationContext.getBean("Bean2");

        System.out.println(bean1 == bean2);


    }



}
