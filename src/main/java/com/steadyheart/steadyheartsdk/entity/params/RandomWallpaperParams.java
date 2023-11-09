package com.steadyheart.steadyheartsdk.entity.params;

import lombok.Data;

import java.io.Serializable;

/**
 * 获取随机壁纸需要携带的参数
 * @author steadyheart
 */
@Data
public class RandomWallpaperParams implements Serializable {

    /**
     * 输出壁纸端(pc、mobile)
     */
    private String method;

    /**
     * 壁纸类型(meizi、dongman、fengjing、suiji)
     */
    private String lx;

}
