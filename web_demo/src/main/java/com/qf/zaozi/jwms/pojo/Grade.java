package com.qf.zaozi.jwms.pojo;

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
