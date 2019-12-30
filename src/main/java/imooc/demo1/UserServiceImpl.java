package imooc.demo1;

import imooc.demo1.UserService;

public class UserServiceImpl implements UserService {

    //添加属性
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {

        System.out.println("hello spring"+getName());


    }
}
