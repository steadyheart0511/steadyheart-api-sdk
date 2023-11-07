package com.steadyheart.steadyheartsdk.service.impl;

import com.steadyheart.steadyheartsdk.entity.params.RandomWallpaperParams;
import com.steadyheart.steadyheartsdk.entity.params.TranslationParams;
import com.steadyheart.steadyheartsdk.entity.request.JokeRequest;
import com.steadyheart.steadyheartsdk.entity.request.RandomWallpaperRequest;
import com.steadyheart.steadyheartsdk.entity.request.TranslationRequest;
import com.steadyheart.steadyheartsdk.entity.response.BaseResponse;
import com.steadyheart.steadyheartsdk.entity.response.JokeResponse;
import com.steadyheart.steadyheartsdk.entity.response.RandomWallpaperResponse;
import com.steadyheart.steadyheartsdk.entity.response.TranslationResponse;
import com.steadyheart.steadyheartsdk.service.ApiService;
import com.steadyheart.steadyheartsdk.service.BaseService;

/**
 * @author lts
 * @create 2023-11-03 8:56
 */
public class ApiServiceImpl extends BaseService implements ApiService {

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
