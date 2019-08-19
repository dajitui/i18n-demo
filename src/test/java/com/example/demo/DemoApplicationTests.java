package com.example.demo;

import com.example.demo.util.MessageUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Resource
    MessageUtils messageUtils;

    @Test
    public void contextLoads() {
        System.out.println(messageUtils.get("user.title"));
    }

}
