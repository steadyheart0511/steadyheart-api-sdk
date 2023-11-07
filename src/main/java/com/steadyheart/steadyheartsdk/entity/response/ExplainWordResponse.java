package com.steadyheart.steadyheartsdk.entity.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author steadyheart
 */
@Data
public class ExplainWordResponse implements Serializable {

    /**
     * 解释结果
     */
    String result;
}
