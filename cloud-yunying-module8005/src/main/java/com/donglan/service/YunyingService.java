package com.donglan.service;

import java.util.List;
import java.util.Optional;

import com.donglan.pojo.YunyingBo;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-01-25 10:51:38
 */
public interface YunyingService {

    Optional<List<YunyingBo>> listAll();

    int add(YunyingBo yunyingBo);
}
