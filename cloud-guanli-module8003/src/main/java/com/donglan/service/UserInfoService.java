package com.donglan.service;

import com.donglan.pojo.UserInfo;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-01-29 19:24:35
 */
public interface UserInfoService {

    int addUser(UserInfo userInfo);

    UserInfo login(String username, String password);
}
