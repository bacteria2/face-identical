package com.pingan.fi.algorithm.model.fi;

/**
 * @author IonCannon
 * @date 2018/6/14
 * @decription : content
 */
public class FeatureBody {

    private String imagebase64;
    private String guid;
    private String libid;
    private String feature;


    public FeatureBody(String imagebase64, String guid, String libid) {
        this.imagebase64 = imagebase64;
        this.guid = guid;
        this.libid = libid;
    }

    public String getImagebase64() {
        return imagebase64;
    }

    public void setImagebase64(String imagebase64) {
        this.imagebase64 = imagebase64;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getLibid() {
        return libid;
    }

    public void setLibid(String libid) {
        this.libid = libid;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
