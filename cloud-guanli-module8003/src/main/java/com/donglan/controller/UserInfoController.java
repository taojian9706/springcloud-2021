package com.donglan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.donglan.common.ResultData;
import com.donglan.pojo.UserInfo;
import com.donglan.service.UserInfoService;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-01-29 19:23:51
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @PostMapping("/add")
    public ResultData addUser(@RequestBody UserInfo userInfo) {
        userInfo.setPassword(userInfo.getPassword());
        return ResultData.success(userInfoService.addUser(userInfo));
    }
}
