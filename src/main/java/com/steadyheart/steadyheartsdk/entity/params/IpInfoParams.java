package com.steadyheart.steadyheartsdk.entity.params;

import lombok.Data;

import java.io.Serializable;

/**
 * 查询ip属地需要的参数
 * @author steadyheart
 */
@Data
public class IpInfoParams implements Serializable {
    /**
     * ip地址
     */
    private String ip;
}
