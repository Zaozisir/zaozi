package com.qf.student_208_308.web_demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    private String stuNum;
    private String  stuLoginPwd;
    private String stuName;
    private String stuGender;
    private int stuAge;
    private String stuTel;
    private String stuAdd;
}
