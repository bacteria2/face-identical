package com.pingan.fi.algorithm.model.fi;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : content
 */
public class ImageFeatureValue {
    private String imageBase64;
    private String feature;
    private String faceId;

    private int leftTopX;  //左上角X坐标
    private int leftTopY;  //左上角Y坐标
    private int rightBtmY;  //右下角Y坐标
    private int rightBtmX;  //右下角X坐标



    public ImageFeatureValue() {
    }

    public int getLeftTopX() {
        return leftTopX;
    }

    public void setLeftTopX(int leftTopX) {
        this.leftTopX = leftTopX;
    }

    public int getLeftTopY() {
        return leftTopY;
    }

    public void setLeftTopY(int leftTopY) {
        this.leftTopY = leftTopY;
    }

    public int getRightBtmY() {
        return rightBtmY;
    }

    public void setRightBtmY(int rightBtmY) {
        this.rightBtmY = rightBtmY;
    }

    public int getRightBtmX() {
        return rightBtmX;
    }

    public void setRightBtmX(int rightBtmX) {
        this.rightBtmX = rightBtmX;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getFaceId() {
        return faceId;
    }

    @JSONField(name = "guid")
    public void setFaceId(String faceId) {
        this.faceId = faceId;
    }

    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }
}
