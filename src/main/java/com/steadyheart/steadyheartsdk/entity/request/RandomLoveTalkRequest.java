package com.steadyheart.steadyheartsdk.entity.request;

import com.steadyheart.steadyheartsdk.entity.enums.RequestMethodEnum;
import com.steadyheart.steadyheartsdk.entity.params.RandomLoveTalkParams;
import com.steadyheart.steadyheartsdk.entity.response.RandomLoveTalkResponse;

/**
 * @author steadyheart
 */
public class RandomLoveTalkRequest extends BaseRequest<RandomLoveTalkParams, RandomLoveTalkResponse>{

    /**
     * 获取请求接口路径
     *
     * @return
     */
    @Override
    public String getPath() {
        return "/loveTalk";
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
    public Class<RandomLoveTalkResponse> getResponseClass() {
        return RandomLoveTalkResponse.class;
    }
}
