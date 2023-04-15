package com.qf.student_208_308.web_demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course {

    private int courseId;
    private String courseName;
    private float courseScore;
    private int courseXs;
    private int courseCap;
    private String courseDesc;
    private String courseTid;
}
