package com.qf.student_208_308.web_demo.controller;

import com.qf.student_208_308.web_demo.pojo.ResultDate;
import com.qf.student_208_308.web_demo.pojo.Teacher;
import com.qf.student_208_308.web_demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.annotation.WebServlet;

@WebServlet
@RestController
@RequestMapping("/teacher")
@CrossOrigin
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/addTeacher")
    public ResultDate addTeacher(Teacher teacher) {
        return teacherService.addTeacher(teacher);
    }

    @RequestMapping("/list")
    public ResultDate pageList(int page, int limit){
        return teacherService.getByPage(page, limit);
    }
}
