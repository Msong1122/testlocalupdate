package com.msong.springboot_swagger.controller;

import com.msong.springboot_swagger.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(value = "用户模块 " ,tags = "用户操作模块")
public class UserController {
    public static List<User> list ;
    public static User u1 ;
    public static User u2 ;
    public static User u3 ;
    static{
        list = new ArrayList<>();
        User u1 = new User("msong", "23", 23, "1");
        User u2 = new User("wangpan", "24", 23, "1");
        User u3 = new User("liumanyu", "22", 23, "0");
        list.add(u1);
        list.add(u2);
        list.add(u3);
    }

    @GetMapping("/hello")
    @ApiOperation(value = "测试swagger")
    public String hello(){
        return "hello swagger";
    }

    @GetMapping("/getUser/{id}")
    @ApiOperation(value = "获取用户",notes = "给一个id,就返回User对象")
    @ApiImplicitParam( value = "用户的id",name = "id",dataType = "int",required = true)
    public User getUserById(@PathVariable(value = "id") String id ){
        return list.get(Integer.parseInt(id));
    }
}
