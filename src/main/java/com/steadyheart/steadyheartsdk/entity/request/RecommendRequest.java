package com.steadyheart.steadyheartsdk.entity.request;

import com.steadyheart.steadyheartsdk.entity.enums.RequestMethodEnum;
import com.steadyheart.steadyheartsdk.entity.params.RecommendParams;
import com.steadyheart.steadyheartsdk.entity.response.RecommendResponse;

/**
 * @author steadyheart
 */
public class RecommendRequest extends BaseRequest<RecommendParams, RecommendResponse>{

    /**
     * 获取请求接口路径
     *
     * @return
     */
    @Override
    public String getPath() {
        return "/recommend";
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
    public Class<RecommendResponse> getResponseClass() {
        return RecommendResponse.class;
    }
}
