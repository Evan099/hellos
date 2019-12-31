package imooc.demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//xml和注解整合开发
public class springTest3 {
    String appxml = "applicationContext.xml";
    @Test
    public void demo1(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(appxml);
        ProductService productService = (ProductService) applicationContext.getBean("productService");

        productService.save();

    }




}
