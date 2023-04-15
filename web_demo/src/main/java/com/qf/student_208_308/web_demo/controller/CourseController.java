package com.qf.student_208_308.web_demo.controller;

import com.qf.student_208_308.web_demo.pojo.Course;
import com.qf.student_208_308.web_demo.pojo.ResultDate;
import com.qf.student_208_308.web_demo.service.CourseService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.annotation.WebServlet;

@WebServlet
@RestController
@RequestMapping("/course")
@CrossOrigin
public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @RequestMapping("/addCourse")
    public ResultDate addTeacher(Course course) {
        System.out.println(course);
        return courseService.addCourse(course);
    }
}
