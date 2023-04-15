package com.qf.zaozi.jwms.dao;

import com.qf.zaozi.jwms.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentDao {

    Student selectByNumAndPwd(@Param("id") String mgrId, @Param("pwd") String pwd);
}
