package com.ml.pattern.service;

import com.ml.pattern.util.MLBaseResult;

/**
 * @ClassName IUserService
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/20 13:40
 * @Version 1.0
 */
public interface IUserService {

    MLBaseResult<String> findById(String id);
}
