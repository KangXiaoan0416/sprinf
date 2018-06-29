package com.xiaoan.part1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * 功能描述: TODO
 * 重复注解支持
 * @author: 康小安 
 * @date: 18-6-28 下午7:54
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@PropertySource("")
@PropertySource("")
public class Application {
    @Autowired
    private Environment env;


}
