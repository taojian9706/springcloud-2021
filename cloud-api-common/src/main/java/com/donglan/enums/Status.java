package com.donglan.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-01-25 11:55:35
 */
@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)//json序列化以对象的形式
public enum Status {

    NORMAL(200, "normal"), ABNORMAL(500, "abnormal");

    private Integer code;

    @EnumValue// mybatis写入这个值
    private String msg;

    Status(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @JsonCreator // json 反序列化
    public static Status valueOf(@JsonProperty("code") int code) {
        for (Status type : Status.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        return null;
    }

}
