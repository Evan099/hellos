package imooc.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component("userService")
@Service("userService")
public class UserService {
//普通类型注入
    @Value("米饭")
    private String something;

//对象类型注入
    //    @Autowired//按类型注入
    //    @Qualifier("userDao")
    @Resource(name = "userDao")//这一句注解相当于上面的两句注解
    private UserDao userDao;

    public String sayHello(String name){
        return "'Hello"+name;
    }

    public void eat(){
        System.out.println("eat"+something);
    }

    public void save(){
        System.out.println("Service中保存用户的方法");
        userDao.save();

    }

}
