package com.steadyheart.steadyheartsdk.service;

import com.steadyheart.steadyheartsdk.client.SteadyheartClient;
import com.steadyheart.steadyheartsdk.entity.params.ExplainWordParams;
import com.steadyheart.steadyheartsdk.entity.params.RandomWallpaperParams;
import com.steadyheart.steadyheartsdk.entity.params.TranslationParams;
import com.steadyheart.steadyheartsdk.entity.request.BaseRequest;
import com.steadyheart.steadyheartsdk.entity.response.*;

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

    /**
     * 翻译接口
     * @param translationParams 翻译参数
     * @return  翻译结果
     */
    BaseResponse<TranslationResponse> getTranslation(TranslationParams translationParams);

    /**
     * 获取笑话
     * @return  笑话
     */
    BaseResponse<JokeResponse> getJoke();


    /**
     * 获取随机壁纸
     * @param randomWallpaperParams 获取随机壁纸所需参数
     * @return  壁纸地址
     */
    BaseResponse<RandomWallpaperResponse> getRandomWallpaper(RandomWallpaperParams randomWallpaperParams);

    /**
     * 名词解释
     * @param explainWordParams 名词解释所需参数
     * @return  解释结果
     */
    BaseResponse<ExplainWordResponse> getExplainWord(ExplainWordParams explainWordParams);
}
