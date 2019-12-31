package imooc.demo2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Bean2")
@Scope("prototype")//指定是单例还是多例模式（不加则为单例，加了则为多例）
public class Bean2 {




}
