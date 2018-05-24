package com.xiaoan.service.impl.hello;

import com.xiaoan.service.hello.HelloWorld;

public class StrutsHelloWorld implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.printf("Struts say HelloWorld");
    }
}
