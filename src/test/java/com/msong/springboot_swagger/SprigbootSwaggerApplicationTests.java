package com.msong.springboot_swagger;

import com.msong.springboot_swagger.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SprigbootSwaggerApplicationTests {
    @Autowired
    private User user;
    @Test
    public void contextLoads() {

        System.out.println(user.getName());
    }

}
