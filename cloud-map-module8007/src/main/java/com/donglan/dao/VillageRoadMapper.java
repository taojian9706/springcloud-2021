package com.donglan.dao;

import com.donglan.pojo.VillageRoad;

public interface VillageRoadMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(VillageRoad record);

    int insertSelective(VillageRoad record);

    VillageRoad selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(VillageRoad record);

    int updateByPrimaryKey(VillageRoad record);
}