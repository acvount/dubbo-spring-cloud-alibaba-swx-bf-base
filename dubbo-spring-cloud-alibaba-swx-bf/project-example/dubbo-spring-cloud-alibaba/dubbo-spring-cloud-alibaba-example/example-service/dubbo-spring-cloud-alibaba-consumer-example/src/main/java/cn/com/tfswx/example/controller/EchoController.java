package cn.com.tfswx.example.controller;

import cn.com.tfswx.provider.api.EchoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * author : 小凡
 * data   : create in 2020/9/11 10:30
 * description : 没啥好解释的,觉得垃圾就重写吧
 **/

@RestController
public class EchoController {

    @DubboReference(version = "1.0.0")
    private EchoService echoService;

    @GetMapping("echo/{str}")
    public String echo(@PathVariable("str") String str){
        return echoService.echo(str);
    }
}
