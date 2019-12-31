package imooc.demo2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("Bean1")
public class Bean1 {

@PostConstruct//出生时执行
    public void init(){
        System.out.println("initBean");
    }

    public void say(){
        System.out.println("say……");
    }

@PreDestroy//销毁时执行
    public void destory(){
        System.out.println("destoryBean");
    }


}
