package com.qf.student_208_308.web_demo.dao;

import com.qf.student_208_308.web_demo.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ManagerDao {

    Manager selectByIdAndPwd(@Param("mid") String mgrId, @Param("pwd") String pwd);

}
