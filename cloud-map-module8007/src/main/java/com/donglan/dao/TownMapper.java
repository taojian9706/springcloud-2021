package com.donglan.dao;

import com.donglan.pojo.Town;

public interface TownMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Town record);

    int insertSelective(Town record);

    Town selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Town record);

    int updateByPrimaryKey(Town record);
}