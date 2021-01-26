package com.donglan.pojo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.donglan.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-01-25 10:54:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "yunying")
public class YunyingBo implements Serializable {

    @TableId
    private Long id;

    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date date;

    private Status status;
}
