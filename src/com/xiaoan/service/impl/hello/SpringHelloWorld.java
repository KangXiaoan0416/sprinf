package com.xiaoan.service.impl.hello;

import com.xiaoan.service.hello.HelloWorld;

public class SpringHelloWorld implements HelloWorld {


    @Override
    public void sayHello() {
        System.out.printf("Spring say HelloWorld");
    }
}
