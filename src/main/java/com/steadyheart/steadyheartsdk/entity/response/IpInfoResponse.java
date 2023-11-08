package com.steadyheart.steadyheartsdk.entity.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author steadyheart
 */
@Data
public class IpInfoResponse implements Serializable {


    /**
     * 所在国家
     */
    private String country;

    /**
     * 所在省份
     */
    private String prov;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 运营商
     */
    private String isp;
}
