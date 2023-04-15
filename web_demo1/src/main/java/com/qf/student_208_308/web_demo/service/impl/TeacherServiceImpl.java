package com.qf.student_208_308.web_demo.service.impl;

import com.qf.student_208_308.web_demo.dao.TeacherDao;
import com.qf.student_208_308.web_demo.pojo.ResultDate;
import com.qf.student_208_308.web_demo.pojo.Teacher;
import com.qf.student_208_308.web_demo.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherDao teacherDao;

    public TeacherServiceImpl(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public ResultDate addTeacher(Teacher teacher) {
        String password = teacher.getTeacherTel().substring(3);
        teacher.setTeacherLoginPwd(password);
        if (teacherDao.addTeacher(teacher) > 0) {
            return new ResultDate(1, "添加成功！", null);
        }
        return new ResultDate(0, "数据添加错误！", null);
    }

    @Override
    public ResultDate getByPage(int page, int limit) {
        List<Teacher> teachers = teacherDao.selectByPage((page - 1) * limit, limit);
        return new ResultDate(1, "查询成功！", teachers, teacherDao.selectCount());
    }
}

