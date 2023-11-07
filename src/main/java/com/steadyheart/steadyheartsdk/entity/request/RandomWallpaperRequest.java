package com.steadyheart.steadyheartsdk.entity.request;

import com.steadyheart.steadyheartsdk.entity.enums.RequestMethodEnum;
import com.steadyheart.steadyheartsdk.entity.params.RandomWallpaperParams;
import com.steadyheart.steadyheartsdk.entity.response.RandomWallpaperResponse;

/**
 * @author steadyheart
 */
public class RandomWallpaperRequest extends BaseRequest<RandomWallpaperParams, RandomWallpaperResponse> {
    /**
     * 获取请求接口路径
     *
     * @return
     */
    @Override
    public String getPath() {
        return "/randomWallpaper";
    }

    /**
     * 获取请求接口时的请求方式
     *
     * @return
     */
    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }

    /**
     * 获取响应类
     *
     * @return
     */
    @Override
    public Class getResponseClass() {
        return RandomWallpaperResponse.class;
    }
}
