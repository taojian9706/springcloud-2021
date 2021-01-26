package com.donglan.dao;

import com.donglan.pojo.MotorRoad;

public interface MotorRoadMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(MotorRoad record);

    int insertSelective(MotorRoad record);

    MotorRoad selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(MotorRoad record);

    int updateByPrimaryKey(MotorRoad record);
}