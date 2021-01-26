package com.donglan.dao;

import com.donglan.pojo.TownshipRoad;

public interface TownshipRoadMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(TownshipRoad record);

    int insertSelective(TownshipRoad record);

    TownshipRoad selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(TownshipRoad record);

    int updateByPrimaryKey(TownshipRoad record);
}