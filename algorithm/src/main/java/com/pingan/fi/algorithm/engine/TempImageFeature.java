package com.pingan.fi.algorithm.engine;

import com.pingan.fi.algorithm.model.fi.ImageFeatureModel;

/**
 * @author IonCannon
 * @date 2018/6/13
 * @decription :  特征值临时中专对象
 */
public class TempImageFeature  {
    private String guid;
    private String libid;
    private String feature;

    public TempImageFeature() {
    }

    public TempImageFeature(String guid, String libid, String feature) {
        this.guid = guid;
        this.libid = libid;
        this.feature = feature;
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
