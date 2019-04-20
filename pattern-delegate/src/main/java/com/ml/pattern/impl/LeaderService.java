package com.ml.pattern.impl;

import com.ml.pattern.IProgrammerService;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ZhangSanService
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/20 10:10
 * @Version 1.0
 */
public class LeaderService implements IProgrammerService {
    private static final String NAME = "项目负责人";

    private static final Map<String,IProgrammerService> programmerMap = new HashMap<String,IProgrammerService>();

    static {
        programmerMap.put("架构",new ZhangSanService());
        programmerMap.put("服务器",new LiSiService());
    }

    @Override
    public void work(String command) {
        programmerMap.get(command).work(command);
    }
}
