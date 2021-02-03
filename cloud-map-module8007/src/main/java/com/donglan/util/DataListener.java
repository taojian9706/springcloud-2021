package com.donglan.util;

import java.util.ArrayList;
import java.util.List;

import cn.hutool.json.JSONUtil;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.donglan.dao.BridgeMapper;
import com.donglan.dao.CountyRoadMapper;
import com.donglan.pojo.Bridge;
import com.donglan.pojo.CountyRoad;
import lombok.extern.slf4j.Slf4j;
import sun.rmi.runtime.Log;

/**
 * @author TAOJIAN
 * @version 1.0
 * @since 2021-02-01 15:13:02
 */
@Slf4j
public class DataListener extends AnalysisEventListener<CountyRoad> {

    private CountyRoadMapper countyRoadMapper;

    private static final int BATCH_COUNT = 5;
    List<CountyRoad> list = new ArrayList<>();

    public DataListener(CountyRoadMapper countyRoadMapper ) {
        this.countyRoadMapper = countyRoadMapper;
    }
    @Override
    public void invoke(CountyRoad bridge, AnalysisContext analysisContext) {
      log.info("解析到一条数据:{}", JSONUtil.toJsonStr(bridge));
      list.add(bridge);
      if (list.size() >= BATCH_COUNT) {
          saveData();
          list.clear();
      }
    }

    private void saveData() {
        log.info("{}条数据，开始存储数据库！", list.size());
        countyRoadMapper.batchSave(list);
        log.info("所有数据解析完成！");
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        saveData();
        log.info("所有数据解析完成!");
    }
}
