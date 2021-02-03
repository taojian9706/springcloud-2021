package com.donglan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.donglan.dao.BridgeMapper;
import com.donglan.pojo.Border;
import com.donglan.pojo.Bridge;
import com.donglan.service.BridgeService;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-02-01 14:50:52
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class BridgeServiceImpl implements BridgeService {

    @Autowired
    private BridgeMapper bridgeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return bridgeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Bridge record) {
        return bridgeMapper.insert(record);
    }

    @Override
    public int insertSelective(Bridge record) {
        return bridgeMapper.insertSelective(record);
    }

    @Override
    public Bridge selectByPrimaryKey(Integer id) {
        return bridgeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Bridge record) {
        return bridgeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Bridge record) {
        return bridgeMapper.updateByPrimaryKey(record);
    }
}
