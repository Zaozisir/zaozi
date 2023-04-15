package com.qf.zaozi.jwms.dao;

import com.qf.zaozi.jwms.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TeacherDao {

    Teacher selectByIdAndPwd(@Param("tid") String tid,@Param("pwd") String pwd);

    int addTeacher(Teacher teacher);

    List<Teacher> selectByPage(@Param("start") int start, @Param("limit")int limit);

    int selectCount();
}
