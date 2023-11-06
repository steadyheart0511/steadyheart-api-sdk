package com.steadyheart.steadyheartsdk.entity.request;

import com.steadyheart.steadyheartsdk.entity.enums.RequestMethodEnum;
import com.steadyheart.steadyheartsdk.entity.params.TranslationParams;
import com.steadyheart.steadyheartsdk.entity.response.TranslationResponse;

/**
 * 翻译请求
 * @author lts
 */
public class TranslationRequest extends BaseRequest<TranslationParams, TranslationResponse>{

    @Override
    public String getPath() {
        return "/translate";
    }

    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }

    @Override
    public Class<TranslationResponse> getResponseClass() {
        return TranslationResponse.class;
    }
}
