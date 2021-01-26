package com.donglan.dao;

import com.donglan.pojo.CountyRoad;

public interface CountyRoadMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(CountyRoad record);

    int insertSelective(CountyRoad record);

    CountyRoad selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(CountyRoad record);

    int updateByPrimaryKey(CountyRoad record);
}