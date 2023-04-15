package com.qf.student_208_308.web_demo.dao;

import com.qf.student_208_308.web_demo.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentDao {

    Student selectByNumAndPwd(@Param("id") String mgrId, @Param("pwd") String pwd);
}
