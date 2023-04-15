package com.qf.student_208_308.web_demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Manager {

    private String managerId;
    private String managerLoginPwd;
    private String managerName;
    private String managerGender;
    private String managerTel;
    private String managerDesc;

}
