package com.qf.student_208_308.web_demo.service.impl;

import com.qf.student_208_308.web_demo.dao.ManagerDao;
import com.qf.student_208_308.web_demo.dao.StudentDao;
import com.qf.student_208_308.web_demo.dao.TeacherDao;
import com.qf.student_208_308.web_demo.pojo.Manager;
import com.qf.student_208_308.web_demo.pojo.ResultDate;
import com.qf.student_208_308.web_demo.pojo.Student;
import com.qf.student_208_308.web_demo.pojo.Teacher;
import com.qf.student_208_308.web_demo.service.UserService;
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
