package com.donglan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.donglan.dao.UserInfoMapper;
import com.donglan.pojo.UserInfo;
import com.donglan.service.UserInfoService;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-01-29 19:29:35
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public int addUser(UserInfo userInfo) {
        return userInfoMapper.insert(userInfo);
    }

    @Override
    public UserInfo login(String username, String password) {
        return userInfoMapper.selectOne(new QueryWrapper<UserInfo>().lambda().eq(UserInfo::getPassword, password)
            .eq(UserInfo::getUsername, username));
    }
}
