package com.qf.zaozi.jwms.controller;

import com.qf.zaozi.jwms.pojo.ResultDate;
import com.qf.zaozi.jwms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ResultDate login(String username, String password, String role) {
        return userService.chek(username, password, role);
    }
}
