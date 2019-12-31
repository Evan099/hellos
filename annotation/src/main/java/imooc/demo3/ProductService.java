package imooc.demo3;


import org.springframework.stereotype.Component;

import javax.annotation.Resource;

//xml和注解混合使用讲解
public class ProductService {

    @Resource(name = "categoryDao")
    private CategoryDao categoryDao;

    @Resource(name = "productDao")
    private ProductDao productDao;


    public void save(){
        System.out.println("ProductService的save方法执行了……");
        categoryDao.save();
        productDao.save();
    }


}
