package com.imooc.aop.demo2;

//代理知识总结

//spring在运行期，生成动态代理对象，不需要特殊编译器
//不CGLIB是正对目标类生产子类，因此类或方法不能使用final修饰
//spring只支持方法连接点，不提供属性连接点