package com.qf.zaozi.jwms.service;

import com.qf.zaozi.jwms.pojo.ResultDate;
import com.qf.zaozi.jwms.pojo.Teacher;

public interface TeacherService {

    ResultDate addTeacher(Teacher teacher);

    ResultDate getByPage(int page, int limit);
}
