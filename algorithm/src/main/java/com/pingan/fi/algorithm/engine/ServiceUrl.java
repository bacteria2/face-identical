package com.pingan.fi.algorithm.engine;

/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : content
 */
public enum ServiceUrl {

    Search1V1("/searchFace1V1"),   //图片搜索

    Search1V1Vec("/searchFeatureVec1V1"),   //特征值搜索

    FeatureGeneration("/buildFeatureVecByB64"),    //特征值生成

    FeatureGenerationByUrl("/buildFeatureVecByUrl"),  //url特征值生成

    ImageQuality("imageQuality");  //图片质量评估


    private String url;


    ServiceUrl(String url) {
        this.url = url;
    }


    @Override
    public String toString() {

        return this.url;
    }
}
