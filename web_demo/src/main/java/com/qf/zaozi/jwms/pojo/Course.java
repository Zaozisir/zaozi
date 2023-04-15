package com.qf.zaozi.jwms.pojo;

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
