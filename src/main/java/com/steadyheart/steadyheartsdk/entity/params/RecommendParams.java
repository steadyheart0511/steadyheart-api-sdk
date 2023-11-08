package com.steadyheart.steadyheartsdk.entity.params;

import lombok.Data;

import java.io.Serializable;

/**
 * 推荐
 * @author steadyheart
 */
@Data
public class RecommendParams implements Serializable {

    /**
     * 分类
     */
    private String category;

    /**
     * 类型
     */
    private String type;
}
