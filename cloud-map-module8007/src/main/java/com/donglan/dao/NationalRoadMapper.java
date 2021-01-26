package com.donglan.dao;

import com.donglan.pojo.NationalRoad;

public interface NationalRoadMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(NationalRoad record);

    int insertSelective(NationalRoad record);

    NationalRoad selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(NationalRoad record);

    int updateByPrimaryKey(NationalRoad record);
}