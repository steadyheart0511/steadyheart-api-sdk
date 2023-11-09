package com.steadyheart.steadyheartsdk.entity.params;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lts
 * @create 2024-01-08 12:19
 */
@Data
public class TranslationParams implements Serializable {

    /**
     * 被翻译的文字的语言
     */
    private String sourceLanguage;

    /**
     * 转换成什么语言
     */
    private String targetLanguage;

    /**
     * 待转换的文字
     */
    private String sourceText;

}
