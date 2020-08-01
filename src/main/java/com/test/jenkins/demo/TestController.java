package com.test.jenkins.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhu_huan
 * @createTime : 2020/8/1
 **/
@RestController
public class TestController {

    @GetMapping("/get")
    public String test(){
        return "hello jenkins";

    }
}
