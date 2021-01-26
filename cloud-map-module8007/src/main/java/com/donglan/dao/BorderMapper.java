package com.donglan.dao;

import com.donglan.pojo.Border;

public interface BorderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Border record);

    int insertSelective(Border record);

    Border selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Border record);

    int updateByPrimaryKey(Border record);
}