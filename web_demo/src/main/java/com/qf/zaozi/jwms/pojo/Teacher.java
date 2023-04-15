package com.qf.zaozi.jwms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Teacher {
    private String teacherId;
    private String teacherLoginPwd;
    private String teacherName;
    private String teacherGender;
    private String teacherTel;
    private String teacherLevel;
    private String teacherRemark;
}
