package com.qf.student_208_308.web_demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Grade {

    private String sNum;
    private int cId;
    private float grade;
}
