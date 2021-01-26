package com.donglan.dao;

import com.donglan.pojo.Bridge;

public interface BridgeMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Bridge record);

    int insertSelective(Bridge record);

    Bridge selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Bridge record);

    int updateByPrimaryKey(Bridge record);
}