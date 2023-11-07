package com.steadyheart.steadyheartsdk.entity.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @author steadyheart
 */
@Data
public class RandomWallpaperResponse implements Serializable {
    /**
     * 壁纸地址
     */
    private String imgUrl;
}
