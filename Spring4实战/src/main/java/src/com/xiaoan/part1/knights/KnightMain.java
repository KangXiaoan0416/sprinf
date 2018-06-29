package com.xiaoan.part1.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述: TODO
 * 装载勇气配置
 * @author: 康小安
 * @date: 18-6-29 下午3:46
 */
public class KnightMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:com/xiaoan/part1/knights/knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
