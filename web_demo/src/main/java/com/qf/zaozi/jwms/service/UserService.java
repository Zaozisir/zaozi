package com.qf.zaozi.jwms.service;

import com.qf.zaozi.jwms.pojo.ResultDate;

public interface UserService {

    ResultDate chek(String username, String password, String role);
}
