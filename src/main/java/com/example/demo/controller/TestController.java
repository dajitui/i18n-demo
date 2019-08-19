package com.example.demo.controller;

import com.example.demo.util.MessageUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created on 2019/8/19.
 *
 * @author yangsen
 */
@RestController
public class TestController {

    @Resource
    MessageUtils messageUtils;

    //http://localhost:8080/get?lang=en_US
    @GetMapping("/get")
    public String a(){
        return messageUtils.get("user.title");
    }

}
