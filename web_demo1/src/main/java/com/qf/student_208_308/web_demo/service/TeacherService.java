package com.qf.student_208_308.web_demo.service;

import com.qf.student_208_308.web_demo.pojo.ResultDate;
import com.qf.student_208_308.web_demo.pojo.Teacher;

public interface TeacherService {

    ResultDate addTeacher(Teacher teacher);

    ResultDate getByPage(int page, int limit);
}
