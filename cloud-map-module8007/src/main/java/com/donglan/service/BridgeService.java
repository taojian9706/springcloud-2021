package com.donglan.service;

import com.donglan.pojo.Bridge;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-02-01 14:50:33
 */
public interface BridgeService {

    int deleteByPrimaryKey(Integer id);

    int insert(Bridge record);

    int insertSelective(Bridge record);

    Bridge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bridge record);

    int updateByPrimaryKey(Bridge record);
}
