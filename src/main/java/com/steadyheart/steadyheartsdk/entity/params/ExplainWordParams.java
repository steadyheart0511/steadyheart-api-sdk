package com.steadyheart.steadyheartsdk.entity.params;

import lombok.Data;

import java.io.Serializable;

/**
 * 解释词语
 * @author steadyheart
 */
@Data
public class ExplainWordParams implements Serializable {

    /**
     * 词语
     */
    String word;
}
