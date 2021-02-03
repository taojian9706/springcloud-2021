package com.donglan.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@TableName(value = "bridge")
@NoArgsConstructor
@AllArgsConstructor
public class Bridge {
    private Integer fid;

    private String crowid;

    private String qlbm;

    private String lxbm;

    private String lxmc;

    private String ldxlh;

    private String qlmc;

    private Double centerzh;

    private Integer akjf;

    private Integer ajchnxf;

    private String szxzqh;

    private String tbdwdm;

}