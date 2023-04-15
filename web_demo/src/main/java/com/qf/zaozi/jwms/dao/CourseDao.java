package com.qf.zaozi.jwms.dao;

import com.qf.zaozi.jwms.pojo.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseDao {
    int addCourse(Course course);
}
