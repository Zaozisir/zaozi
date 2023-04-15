package com.qf.zaozi.jwms.dao;

import com.qf.zaozi.jwms.pojo.Manager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ManagerDao {

    Manager selectByIdAndPwd(@Param("mid") String mgrId, @Param("pwd") String pwd);

}
