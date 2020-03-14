package com.crm.utils;

import com.crm.enums.ExceptionEnums;
import lombok.Data;

import java.util.Date;

@Data
public class ResponseResult {
    private int status;
    private String msg;
    private Long time;

    public ResponseResult(ExceptionEnums exceptionEnums){
        this.status = exceptionEnums.getStatus();
        this.msg = exceptionEnums.getMsg();
        this.time = new Date().getTime();
    }
}
