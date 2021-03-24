package com.imooc.controller;

import com.imooc.pojo.Resource;
import com.imooc.util.IMoocJSONResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public Object hello(){
        return "hello imooc~~";
    }

    @RequestMapping("/getResource")
    public IMoocJSONResult getResource(){
        Resource bean = new Resource();
        // 将resource的属性拷贝到bean中
        BeanUtils.copyProperties(resource,bean);
        return IMoocJSONResult.ok(bean);
    }
}
