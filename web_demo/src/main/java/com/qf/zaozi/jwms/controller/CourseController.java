package com.qf.zaozi.jwms.controller;

import com.qf.zaozi.jwms.pojo.Course;
import com.qf.zaozi.jwms.pojo.ResultDate;
import com.qf.zaozi.jwms.service.CourseService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
