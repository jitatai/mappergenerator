package com.jt.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 一般返回实体（直接用Object，学了泛型再讨论新的版本）
 *
 * @author qiyu
 */
@Data
public class Result implements Serializable {

    private Integer code;
    private String message;
    private Object data;

    private Result(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private Result(Integer code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }

    /**
     * 带数据成功返回
     *
     * @param data
     * @return
     */
    public static Result success(Object data) {
        return new Result(ExceptionCodeEnum.SUCCESS.getCode(), ExceptionCodeEnum.SUCCESS.getDesc(), data);
    }

    /**
     * 不带数据成功返回
     *
     * @return
     */
    public static Result success() {
        return success(null);
    }

    /**
     * 通用错误返回
     *
     * @param exceptionCodeEnum
     * @return
     */
    public static Result error(ExceptionCodeEnum exceptionCodeEnum) {
        return new Result(exceptionCodeEnum.getCode(), exceptionCodeEnum.getDesc());
    }

    /**
     * 通用错误返回
     *
     * @param exceptionCodeEnum
     * @param msg
     * @return
     */
    public static Result error(ExceptionCodeEnum exceptionCodeEnum, String msg) {
        return new Result(exceptionCodeEnum.getCode(), msg);
    }

    /**
     * 通用错误返回
     *
     * @param exceptionCodeEnum
     * @param data
     * @return
     */
    public static Result error(ExceptionCodeEnum exceptionCodeEnum, Object data) {
        return new Result(exceptionCodeEnum.getCode(), exceptionCodeEnum.getDesc(), data);
    }
}