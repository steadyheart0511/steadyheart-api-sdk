package com.steadyheart.steadyheartsdk.entity.request;

import com.steadyheart.steadyheartsdk.entity.enums.RequestMethodEnum;
import com.steadyheart.steadyheartsdk.entity.params.IpInfoParams;
import com.steadyheart.steadyheartsdk.entity.response.IpInfoResponse;

/**
 * @author steadyheart
 */
public class IpInfoRequest extends BaseRequest<IpInfoParams, IpInfoResponse>{
    /**
     * 获取请求接口路径
     *
     * @return
     */
    @Override
    public String getPath() {
        return "/ip";
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
    public Class<IpInfoResponse> getResponseClass() {
        return IpInfoResponse.class;
    }
}
