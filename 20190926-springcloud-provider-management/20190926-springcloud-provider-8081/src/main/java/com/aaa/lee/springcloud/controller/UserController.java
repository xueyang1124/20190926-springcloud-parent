package com.aaa.lee.springcloud.controller;

import com.aaa.lee.springcloud.model.User;
import com.aaa.lee.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/9/26 9:12
 * @Description
 *      所有的RestFul风格的服务提供者，都必须使用的是RestController标识，如果标识了Controller则Restful调用不到
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userAll")
    public List<User> selectAllUsers()
    {
        System.out.println("8081");
        return userService.selectAllUsers();
    }

}
