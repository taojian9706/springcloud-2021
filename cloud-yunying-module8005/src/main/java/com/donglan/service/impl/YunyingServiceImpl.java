package com.donglan.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.donglan.dao.YunyingMapper;
import com.donglan.pojo.YunyingBo;
import com.donglan.service.YunyingService;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-01-25 10:52:22
 */
@Service
public class YunyingServiceImpl implements YunyingService {

    @Autowired
    private YunyingMapper yunyingMapper;

    @Override
    public Optional<List<YunyingBo>> listAll() {
        return Optional.ofNullable(yunyingMapper.selectList(new QueryWrapper<>()));
    }

    @Override
    public int add(YunyingBo yunyingBo) {
        return yunyingMapper.insert(yunyingBo);
    }
}
