package com.pingan.fi.algorithm.model.fi;

import java.awt.*;

/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : content
 */
public class Search1VNRequest {
    private int top=1;
    private String imageBase64;

    public Search1VNRequest() {
    }

    public Search1VNRequest(int top, String imageBase64) {
        this.top = top;
        this.imageBase64 = imageBase64;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imagebase64) {
        this.imageBase64 = imagebase64;
    }
}
