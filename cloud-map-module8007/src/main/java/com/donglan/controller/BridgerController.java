package com.donglan.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.excel.EasyExcel;
import com.donglan.common.ResultData;
import com.donglan.dao.CountyRoadMapper;
import com.donglan.pojo.CountyRoad;
import com.donglan.util.DataListener;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-02-01 15:05:37
 */
@Controller
@RequestMapping("/bridge")
public class BridgerController {

    @Autowired
    private CountyRoadMapper countyRoadMapper;

    @PostMapping("/upload")
    @ResponseBody
    public ResultData upload(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), CountyRoad.class, new DataListener(countyRoadMapper)).sheet().doRead();
        return ResultData.success();
    }

    @RequestMapping("/toUploadPage")
    public String toUploadPage() {
        return "index";
    }

    @GetMapping("/test")
    @ResponseBody
    public ResultData test() {
        return ResultData.success();
    }
}
