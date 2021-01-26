package com.donglan.dao;

import com.donglan.pojo.ProvincialRoad;

public interface ProvincialRoadMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(ProvincialRoad record);

    int insertSelective(ProvincialRoad record);

    ProvincialRoad selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(ProvincialRoad record);

    int updateByPrimaryKey(ProvincialRoad record);
}