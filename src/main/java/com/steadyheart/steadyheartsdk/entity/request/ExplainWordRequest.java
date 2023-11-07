package com.steadyheart.steadyheartsdk.entity.request;

import com.steadyheart.steadyheartsdk.entity.enums.RequestMethodEnum;
import com.steadyheart.steadyheartsdk.entity.params.ExplainWordParams;
import com.steadyheart.steadyheartsdk.entity.response.ExplainWordResponse;

/**
 * @author steadyheart
 */
public class ExplainWordRequest extends BaseRequest<ExplainWordParams, ExplainWordResponse>{
    /**
     * 获取请求接口路径
     *
     * @return
     */
    @Override
    public String getPath() {
        return "/explain";
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
        return ExplainWordResponse.class;
    }
}
