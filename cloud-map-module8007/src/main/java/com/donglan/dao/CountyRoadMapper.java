package com.donglan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.donglan.pojo.CountyRoad;

@Mapper
public interface CountyRoadMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(CountyRoad record);

    int insertSelective(CountyRoad record);

    CountyRoad selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(CountyRoad record);

    int updateByPrimaryKey(CountyRoad record);

    int batchSave(@Param("list")List<CountyRoad> list);
}