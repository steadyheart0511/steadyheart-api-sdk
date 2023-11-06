package com.steadyheart.steadyheartsdk.service.impl;

import com.steadyheart.steadyheartsdk.entity.params.TranslationParams;
import com.steadyheart.steadyheartsdk.entity.request.JokeRequest;
import com.steadyheart.steadyheartsdk.entity.request.TranslationRequest;
import com.steadyheart.steadyheartsdk.entity.response.BaseResponse;
import com.steadyheart.steadyheartsdk.entity.response.JokeResponse;
import com.steadyheart.steadyheartsdk.entity.response.TranslationResponse;
import com.steadyheart.steadyheartsdk.service.ApiService;
import com.steadyheart.steadyheartsdk.service.BaseService;

/**
 * @author lts
 * @create 2023-11-03 8:56
 */
public class ApiServiceImpl extends BaseService implements ApiService {

    @Override
    public BaseResponse<TranslationResponse> getTranslation(TranslationParams translationParams) {
        TranslationRequest translationRequest = new TranslationRequest();
        translationRequest.setRequestParams(translationParams);
        return request(translationRequest);
    }

    @Override
    public BaseResponse<JokeResponse> getJoke() {
        JokeRequest jokeRequest = new JokeRequest();
        return request(jokeRequest);
    }
}
