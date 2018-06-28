package com.xiaoan.part1;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * 功能描述: TODO
 * spring 数据转换框架，使字符串和java数据类型相互转换
 * @author: 康小安
 * @date: 18-6-28 下午7:48
 */
@RestController
public class LocalDateController {

    @RequestMapping("/date/{localDate}")
    public static String get(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate localDate) {
        return localDate.toString();
    }

}
