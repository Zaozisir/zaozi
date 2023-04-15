package com.qf.student_208_308.web_demo.dao;

import com.qf.student_208_308.web_demo.pojo.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseDao {
    int addCourse(Course course);
}
