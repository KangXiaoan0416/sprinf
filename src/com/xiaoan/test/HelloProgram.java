package com.xiaoan.test;

import com.xiaoan.bean.hello.HelloWordService;
import com.xiaoan.service.hello.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloProgram {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        HelloWordService helloWordService = (HelloWordService) context.getBean("helloWorldService");

        HelloWorld hw = helloWordService.getHelloWorld();

        hw.sayHello();
    }
}
