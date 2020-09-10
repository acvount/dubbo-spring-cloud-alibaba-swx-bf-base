package cn.com.tfswx.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author : 小凡
 * data   : create in 2020/9/10 13:54
 * description : 没啥好解释的,觉得垃圾就重写吧
 **/


@RestController
@RefreshScope
public class SampleController {
//
//    @Value("${user.name}")
//    String userName;
//
//    @Value("${user.age}")
//    int age;
//
//
//    @RequestMapping("/user")
//    public String simple() {
//        return "获取 Nacos Config配置如下：" + userName + " " + age + "!";
//    }
}