package com.qf.zaozi.jwms.service.impl;

import com.qf.zaozi.jwms.dao.ManagerDao;
import com.qf.zaozi.jwms.dao.StudentDao;
import com.qf.zaozi.jwms.dao.TeacherDao;
import com.qf.zaozi.jwms.pojo.Manager;
import com.qf.zaozi.jwms.pojo.ResultDate;
import com.qf.zaozi.jwms.pojo.Student;
import com.qf.zaozi.jwms.pojo.Teacher;
import com.qf.zaozi.jwms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ManagerDao managerDao;
    @Autowired
    private StudentDao studentDao;
    @Autowired
    private TeacherDao teacherDao;

    @Override
    public ResultDate chek(String username, String password, String role) {
        if ("manager".equals(role)) {
            Manager manager = managerDao.selectByIdAndPwd(username, password);
            if (manager == null) {
                return new ResultDate(0, "账号或密码错误!", null);
            }
            return new ResultDate(1, "登录成功", manager.getManagerName());
        }
        if ("student".equals(role)){
            Student student = studentDao.selectByNumAndPwd(username, password);
            if (student == null) {
                return new ResultDate(0, "账号或密码错误!", null);
            }
            return new ResultDate(1, "登录成功", student.getStuName());
        }
        if ("teacher".equals(role)) {
            Teacher teacher = teacherDao.selectByIdAndPwd(username, password);
            if (teacher == null) {
                return new ResultDate(0, "账号或密码错误!", null);
            }
            return new ResultDate(1, "登录成功", teacher.getTeacherName());
        }
        return new ResultDate(0, "身份校验失败!", null);
    }
}
