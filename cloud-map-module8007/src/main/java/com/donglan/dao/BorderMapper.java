package com.donglan.dao;

import org.apache.ibatis.annotations.Mapper;

import com.donglan.pojo.Border;

@Mapper
public interface BorderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Border record);

    int insertSelective(Border record);

    Border selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Border record);

    int updateByPrimaryKey(Border record);
}