package com.donglan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.donglan.pojo.Bridge;

@Mapper
public interface BridgeMapper extends BaseMapper<Bridge> {
    int deleteByPrimaryKey(Integer fid);

    int insert(Bridge record);

    int insertSelective(Bridge record);

    Bridge selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Bridge record);

    int updateByPrimaryKey(Bridge record);

    int batchSave(@Param("bridgeList") List<Bridge> bridgeList);
}