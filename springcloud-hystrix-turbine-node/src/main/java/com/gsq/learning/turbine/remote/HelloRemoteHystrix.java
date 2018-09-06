package com.gsq.learning.turbine.remote;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author guishangquan
 * @date 2018/9/6
 */
@Service
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello2(@RequestParam(value = "name") String name) {
        return "hello " + name + ", this message send failed ";
    }
}
