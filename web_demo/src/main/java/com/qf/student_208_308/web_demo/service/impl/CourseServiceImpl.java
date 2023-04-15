package com.qf.student_208_308.web_demo.service.impl;

import com.qf.student_208_308.web_demo.dao.CourseDao;
import com.qf.student_208_308.web_demo.pojo.Course;
import com.qf.student_208_308.web_demo.pojo.ResultDate;
import com.qf.student_208_308.web_demo.service.CourseService;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseDao courseDao;

    public CourseServiceImpl(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public ResultDate addCourse(Course course) {
        if (courseDao.addCourse(course) > 0) {
            return new ResultDate(1, "添加成功！", null);
        }
        return new ResultDate(0, "添加失败！", null);
    }
}
