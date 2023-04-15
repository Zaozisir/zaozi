package com.qf.zaozi.jwms.service.impl;

import com.qf.zaozi.jwms.dao.CourseDao;
import com.qf.zaozi.jwms.pojo.Course;
import com.qf.zaozi.jwms.pojo.ResultDate;
import com.qf.zaozi.jwms.service.CourseService;
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
