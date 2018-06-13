package com.pingan.fi.algorithm.engine;

/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : content
 */
public enum ServiceUrl {

    Search1V1("/searchFace1V1"),   //1v1图片搜索

    Search1V1Vec("/searchFeatureVec1V1"),   //1v1特征值搜索

    Search1VN("/searchFace1VN"),  //1vn图片搜索

    Search1VNVec("/searchFeatureVec1VN"),  //1vn 特征值搜索

    FaceDetect("/faceDetect"), //人脸小图矩阵识别

    FeatureGeneration("/buildFeatureVecByB64"),    //特征值生成

    FeatureGenerationByUrl("/buildFeatureVecByUrl"),  //url特征值生成

    ImageQuality("imageQuality"),  //图片质量评估

    FetchImageRepoNode("/file_selected/userInfo/userLogin"), //图片库最优节点选取

    ImageDownload("/file_service/fileService/downloadFile") ; //图片库下载

    private String url;


    ServiceUrl(String url) {
        this.url = url;
    }


    @Override
    public String toString() {

        return this.url;
    }
}
