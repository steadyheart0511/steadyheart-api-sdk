package com.steadyheart.steadyheartsdk.service.impl;

import com.steadyheart.steadyheartsdk.entity.params.ExplainWordParams;
import com.steadyheart.steadyheartsdk.entity.params.RandomWallpaperParams;
import com.steadyheart.steadyheartsdk.entity.params.RecommendParams;
import com.steadyheart.steadyheartsdk.entity.params.TranslationParams;
import com.steadyheart.steadyheartsdk.entity.request.*;
import com.steadyheart.steadyheartsdk.entity.response.*;
import com.steadyheart.steadyheartsdk.service.ApiService;
import com.steadyheart.steadyheartsdk.service.BaseService;

/**
 * @author lts
 * @create 2023-11-03 8:56
 */
public class ApiServiceImpl extends BaseService implements ApiService {

    /**
     * 获取推荐信息
     *
     * @param recommendParams 获取推荐信息所需参数
     * @return 推荐结果
     */
    @Override
    public BaseResponse<RecommendResponse> getRecommendInfo(RecommendParams recommendParams) {
        RecommendRequest recommendRequest = new RecommendRequest();
        recommendRequest.setRequestParams(recommendParams);
        return request(recommendRequest);
    }

    /**
     * 名词解释
     *
     * @param explainWordParams 名词解释所需参数
     * @return 解释结果
     */
    @Override
    public BaseResponse<ExplainWordResponse> getExplainWord(ExplainWordParams explainWordParams) {
        ExplainWordRequest explainWordRequest = new ExplainWordRequest();
        explainWordRequest.setRequestParams(explainWordParams);
        return request(explainWordRequest);
    }

    /**
     * 获取随机壁纸
     *
     * @param randomWallpaperParams 获取随机壁纸所需参数
     * @return 壁纸地址
     */
    @Override
    public BaseResponse<RandomWallpaperResponse> getRandomWallpaper(RandomWallpaperParams randomWallpaperParams) {
        RandomWallpaperRequest randomWallpaperRequest = new RandomWallpaperRequest();
        randomWallpaperRequest.setRequestParams(randomWallpaperParams);
        return request(randomWallpaperRequest);
    }

    /**
     * 翻译接口
     * @param translationParams 翻译参数
     * @return  翻译结果
     */
    @Override
    public BaseResponse<TranslationResponse> getTranslation(TranslationParams translationParams) {
        TranslationRequest translationRequest = new TranslationRequest();
        translationRequest.setRequestParams(translationParams);
        return request(translationRequest);
    }

    /**
     * 获取笑话
     * @return  笑话
     */
    @Override
    public BaseResponse<JokeResponse> getJoke() {
        JokeRequest jokeRequest = new JokeRequest();
        return request(jokeRequest);
    }
}
