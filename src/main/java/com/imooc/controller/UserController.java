package com.imooc.controller;

import com.imooc.pojo.User;
import com.imooc.util.IMoocJSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * // @RestController = @Controller + @ResponseBody
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    public IMoocJSONResult hello(){
        User u = new User();
        u.setName("imooc");
        u.setAge(2);
        u.setPassword("imooc");
        u.setBirthday(new Date());
        u.setDesc("hello imooc~~");
        return IMoocJSONResult.ok(u);
    }
}
