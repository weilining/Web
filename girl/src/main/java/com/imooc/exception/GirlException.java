package com.imooc.exception;

import com.imooc.enums.ResultEnum;

/**
 * Created by 韦师兄
 * 2019-04-03 22:47
 */
public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
