package com.vv.enums;

import com.vv.util.IResult;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @program:
 * @description: 响应枚举
 * @author: kangwei
 * @create: 2023-05-24 14:40
 **/
@NoArgsConstructor
@AllArgsConstructor
public enum ResEnum implements IResult {

    SUCCESS(1000, "接口调用成功"),
    COMMON_FAILED(2000, "接口调用失败"),
    VALIDATE_FAILED(2001, "参数校验失败"),
    PARAMS_FAILED(2002, "参数异常"),
    FORBIDDEN(4000, "没有权限访问资源");


    private Integer code;
    private String msg;


    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
