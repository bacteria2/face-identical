package com.pingan.fi.algorithm.model.fi;

/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : 请求的图片数据
 */
public class ImageModel {
    private String type;
    private String data;

    public ImageModel(String type, String data) {
        this.type = type;
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
