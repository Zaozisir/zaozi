package com.qf.zaozi.jwms.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResultDate {

    private int code;
    private String msg;
    private Object date;
    private int count;

    public ResultDate(int code, String msg, Object date) {
        this.code = code;
        this.msg = msg;
        this.date = date;
    }
}
