package com.pingan.fi.algorithm.model.fi;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : content
 */
public class ImageFeatureModel {

    private String imageBase64;
    private String feature;
    private String imageId;
    private String libId;

    private String leftTopX;  //左上角X坐标
    private String leftTopY;  //左上角Y坐标
    private String rightBtmY;  //右下角Y坐标
    private String rightBtmX;  //右下角X坐标



    public ImageFeatureModel() {
    }

    public ImageFeatureModel(String feature, String imageId, String libId) {
        this.feature = feature;
        this.imageId = imageId;
        this.libId = libId;
    }

    public ImageFeatureModel(String leftTopX, String leftTopY, String rightBtmY, String rightBtmX) {
        this.leftTopX = leftTopX;
        this.leftTopY = leftTopY;
        this.rightBtmY = rightBtmY;
        this.rightBtmX = rightBtmX;
    }

    public String getLeftTopX() {
        return leftTopX;
    }

    public void setLeftTopX(String leftTopX) {
        this.leftTopX = leftTopX;
    }

    public String getLeftTopY() {
        return leftTopY;
    }

    public void setLeftTopY(String leftTopY) {
        this.leftTopY = leftTopY;
    }

    public String getRightBtmY() {
        return rightBtmY;
    }

    public void setRightBtmY(String rightBtmY) {
        this.rightBtmY = rightBtmY;
    }

    public String getRightBtmX() {
        return rightBtmX;
    }

    public void setRightBtmX(String rightBtmX) {
        this.rightBtmX = rightBtmX;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    @JSONField(name = "guid")
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String faceId) {
        this.imageId = faceId;
    }

    public String getLibId() {
        return libId;
    }

    public void setLibId(String libId) {
        this.libId = libId;
    }

    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }
}
