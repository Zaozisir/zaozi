package com.qf.student_208_308.web_demo.service;

import com.qf.student_208_308.web_demo.pojo.ResultDate;

public interface UserService {

    ResultDate chek(String username, String password, String role);
}
