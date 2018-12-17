package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/query")
    public String test(HttpSession session) {
        System.out.println("11111");
        System.out.println("11122");
        List<User> list = userMapper.selectAll();
        session.setAttribute("list", list);
        System.out.println(list);
        return "index";
    }
}
