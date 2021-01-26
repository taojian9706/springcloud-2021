package com.donglan.dao;

import com.donglan.pojo.Village;

public interface VillageMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Village record);

    int insertSelective(Village record);

    Village selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Village record);

    int updateByPrimaryKey(Village record);
}