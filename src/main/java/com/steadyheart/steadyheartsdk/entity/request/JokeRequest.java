package com.steadyheart.steadyheartsdk.entity.request;

import com.steadyheart.steadyheartsdk.entity.enums.RequestMethodEnum;
import com.steadyheart.steadyheartsdk.entity.params.JokeParams;
import com.steadyheart.steadyheartsdk.entity.response.JokeResponse;

/**
 *
 * @author lts
 */
public class JokeRequest extends BaseRequest<JokeParams,JokeResponse>{
    @Override
    public String getPath() {
        return "/joke";
    }

    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }

    @Override
    public Class<JokeResponse> getResponseClass() {
        return JokeResponse.class;
    }
}
