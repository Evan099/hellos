package imooc.demo5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest5 {
    String appxml = "applicationContext.xml";

    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(appxml);

        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");

        System.out.println(collectionBean);


    }



}
