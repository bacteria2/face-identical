package com.pingan.fi.algorithm.model.fi;

import com.pingan.fi.algorithm.model.fi.Search1VNRequest;

/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : content
 */
public class SearchTaskModel {
    private String taskId;

    private String imageId;

    private Search1VNRequest fiSearchModel;

    public SearchTaskModel() {
    }

    public SearchTaskModel(String taskId, String imageId, Search1VNRequest fiSearchModel) {
        this.taskId = taskId;
        this.imageId = imageId;
        this.fiSearchModel = fiSearchModel;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Search1VNRequest getFiSearchModel() {
        return fiSearchModel;
    }

    public void setFiSearchModel(Search1VNRequest fiSearchModel) {
        this.fiSearchModel = fiSearchModel;
    }
}
