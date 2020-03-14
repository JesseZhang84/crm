package com.crm.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionEnums {
    SUCCESS(200,"请求成功"),
    PARAM_IS_NULL(400,"参数为空"),
    UN_LOGIN(401,"未登录");
    private int status;
    private String msg;
}
