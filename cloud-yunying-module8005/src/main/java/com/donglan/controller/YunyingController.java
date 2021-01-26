package com.donglan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.donglan.common.ResultData;
import com.donglan.pojo.YunyingBo;
import com.donglan.service.YunyingService;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-01-25 10:49:43
 */
@RestController
@RequestMapping("/yunying")
public class YunyingController {

    @Autowired
    private YunyingService yunyingService;

    @GetMapping("/get/list")
    public List<YunyingBo> list() {
        return yunyingService.listAll().orElse(new ArrayList<YunyingBo>());
    }

    @PostMapping("/add")
    public ResultData add(@RequestBody YunyingBo yunyingBo) {
        yunyingService.add(yunyingBo);
        return ResultData.success();
    }
}
