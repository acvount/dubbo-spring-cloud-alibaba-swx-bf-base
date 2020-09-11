package cn.com.tfswx.example.service;

import cn.com.tfswx.provider.api.EchoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * author : 小凡
 * data   : create in 2020/9/11 9:29
 * description : 没啥好解释的,觉得垃圾就重写吧
 **/

@DubboService(version = "1.0.0")
public class DemoEchoServiceImpl implements EchoService {

    @Override
    public String echo(String string) {
        return "Echo "+string;
    }
}
