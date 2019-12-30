package imooc.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest4 {

    private String appxml = "applicationContext.xml";
    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(appxml);

        User user = (User) applicationContext.getBean("user");

        System.out.println(user);

    }

    @Test
    public void demo2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(appxml);

        Person person = (Person) applicationContext.getBean("person");

        System.out.println(person);

    }

    @Test
    //p的名称空间
    public void demo3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(appxml);

        Person person2 = (Person) applicationContext.getBean("person2");

        System.out.println(person2);

    }

    @Test
    //spel表达式
    public void demo4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(appxml);

        Product product = (Product) applicationContext.getBean("product");

        System.out.println(product);

    }

}
