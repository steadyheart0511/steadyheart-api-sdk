package com.steadyheart.steadyheartsdk.service;

import com.steadyheart.steadyheartsdk.client.SteadyheartClient;
import com.steadyheart.steadyheartsdk.entity.params.*;
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
     * 翻译接口
     * @param steadyheartClient sdk客户端
     * @param translationParams 翻译参数
     * @return  翻译结果
     */
    BaseResponse<TranslationResponse> getTranslation(SteadyheartClient steadyheartClient,TranslationParams translationParams);

    /**
     * 获取笑话
     * @return  笑话
     */
    BaseResponse<JokeResponse> getJoke();

    /**
     * 获取笑话
     * @param steadyheartClient sdk客户端
     * @return  笑话
     */
    BaseResponse<JokeResponse> getJoke(SteadyheartClient steadyheartClient);


    /**
     * 获取随机壁纸
     * @param randomWallpaperParams 获取随机壁纸所需参数
     * @return  壁纸地址
     */
    BaseResponse<RandomWallpaperResponse> getRandomWallpaper(RandomWallpaperParams randomWallpaperParams);

    /**
     * 获取随机壁纸
     * @param steadyheartClient sdk客户端
     * @param randomWallpaperParams 获取随机壁纸所需参数
     * @return  壁纸地址
     */
    BaseResponse<RandomWallpaperResponse> getRandomWallpaper(SteadyheartClient steadyheartClient,RandomWallpaperParams randomWallpaperParams);

    /**
     * 名词解释
     * @param explainWordParams 名词解释所需参数
     * @return  解释结果
     */
    BaseResponse<ExplainWordResponse> getExplainWord(ExplainWordParams explainWordParams);

    /**
     * 名词解释
     * @param steadyheartClient sdk客户端
     * @param explainWordParams 名词解释所需参数
     * @return  解释结果
     */
    BaseResponse<ExplainWordResponse> getExplainWord(SteadyheartClient steadyheartClient,ExplainWordParams explainWordParams);

    /**
     * 获取推荐信息
     * @param recommendParams   获取推荐信息所需参数
     * @return  推荐结果
     */
    BaseResponse<RecommendResponse> getRecommendInfo(RecommendParams recommendParams);

    /**
     * 获取推荐信息
     * @param steadyheartClient sdk客户端
     * @param recommendParams   获取推荐信息所需参数
     * @return  推荐结果
     */
    BaseResponse<RecommendResponse> getRecommendInfo(SteadyheartClient steadyheartClient,RecommendParams recommendParams);

    /**
     * 获取ip归属地
     * @param ipInfoParams  获取ip归属地所需参数
     * @return  ip归属地相关信息
     */
    BaseResponse<IpInfoResponse> getIpInfo(IpInfoParams ipInfoParams);

    /**
     * 获取ip归属地
     * @param steadyheartClient sdk客户端
     * @param ipInfoParams  获取ip归属地所需参数
     * @return  ip归属地相关信息
     */
    BaseResponse<IpInfoResponse> getIpInfo(SteadyheartClient steadyheartClient,IpInfoParams ipInfoParams);

    /**
     * 获取情话
     * @param steadyheartClient sdk客户端
     * @return  情话
     */
    BaseResponse<RandomLoveTalkResponse> getRandomLoveTalk(SteadyheartClient steadyheartClient);

    /**
     * 获取情话
     * @return  情话
     */
    BaseResponse<RandomLoveTalkResponse> getRandomLoveTalk();
}
