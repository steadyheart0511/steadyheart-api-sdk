package com.steadyheart.steadyheartsdk.service;

import com.steadyheart.steadyheartsdk.client.SteadyheartClient;
import com.steadyheart.steadyheartsdk.entity.params.TranslationParams;
import com.steadyheart.steadyheartsdk.entity.request.BaseRequest;
import com.steadyheart.steadyheartsdk.entity.response.BaseResponse;
import com.steadyheart.steadyheartsdk.entity.response.TranslationResponse;

/**
 * api调用
 * @author lts
 * @create 2023-11-02 14:44
 */
public interface ApiService {

    /**
     * 通用请求
     * @param request   请求
     * @param <O>   请求中的参数类型
     * @param <T>   返回值类型
     * @return  返回响应类
     */
    <O,T> BaseResponse<T> request(BaseRequest<O,T> request);

    /**
     * 通用请求
     * @param steadyheartClient sdk客户端
     * @param request   请求
     * @param <O>   参数类型
     * @param <T>   返回类型
     * @return  返回响应类
     */
    <O, T> BaseResponse<T> request(SteadyheartClient steadyheartClient, BaseRequest<O, T> request);


}
