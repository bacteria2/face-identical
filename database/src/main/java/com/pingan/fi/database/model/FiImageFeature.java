package com.pingan.fi.database.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class FiImageFeature implements Serializable {

    private static final long serialVersionUID = 1528943748579L;

    /**
    * 主键
    * isNullAble:0
    */
    private String imageId;

    /**
    * 
    * isNullAble:0
    */
    private String feature;

    /**
    * 
    * isNullAble:0
    */
    private String charact;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String picPath;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String libId;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer topLeftX;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer topLeftY;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer bottomRightX;

    /**
    * 
    * isNullAble:1,defaultVal:0
    */
    private Integer bottomRightY;

    /**
    * 
    * isNullAble:0
    */
    private String creator;

    /**
    * 
    * isNullAble:0
    */
    private java.time.LocalDateTime createTime;

    /**
    * 更新者
    * isNullAble:0,defaultVal:
    */
    private String updator;

    /**
    * 
    * isNullAble:0
    */
    private java.time.LocalDateTime updateTime;

    public void setImageId(String imageId){
        this.imageId = imageId;
    }

    public String getImageId(){
        return this.imageId;
    }

    public void setFeature(String feature){
        this.feature = feature;
    }

    public String getFeature(){
        return this.feature;
    }

    public void setCharact(String charact){
        this.charact = charact;
    }

    public String getCharact(){
        return this.charact;
    }

    public void setPicPath(String picPath){
        this.picPath = picPath;
    }

    public String getPicPath(){
        return this.picPath;
    }

    public void setLibId(String libId){
        this.libId = libId;
    }

    public String getLibId(){
        return this.libId;
    }

    public void setTopLeftX(Integer topLeftX){
        this.topLeftX = topLeftX;
    }

    public Integer getTopLeftX(){
        return this.topLeftX;
    }

    public void setTopLeftY(Integer topLeftY){
        this.topLeftY = topLeftY;
    }

    public Integer getTopLeftY(){
        return this.topLeftY;
    }

    public void setBottomRightX(Integer bottomRightX){
        this.bottomRightX = bottomRightX;
    }

    public Integer getBottomRightX(){
        return this.bottomRightX;
    }

    public void setBottomRightY(Integer bottomRightY){
        this.bottomRightY = bottomRightY;
    }

    public Integer getBottomRightY(){
        return this.bottomRightY;
    }

    public void setCreator(String creator){
        this.creator = creator;
    }

    public String getCreator(){
        return this.creator;
    }

    public void setCreateTime(java.time.LocalDateTime createTime){
        this.createTime = createTime;
    }

    public java.time.LocalDateTime getCreateTime(){
        return this.createTime;
    }

    public void setUpdator(String updator){
        this.updator = updator;
    }

    public String getUpdator(){
        return this.updator;
    }

    public void setUpdateTime(java.time.LocalDateTime updateTime){
        this.updateTime = updateTime;
    }

    public java.time.LocalDateTime getUpdateTime(){
        return this.updateTime;
    }
    @Override
    public String toString() {
        return "FiImageFeature{" +
                "imageId='" + imageId + '\'' +
                "feature='" + feature + '\'' +
                "charact='" + charact + '\'' +
                "picPath='" + picPath + '\'' +
                "libId='" + libId + '\'' +
                "topLeftX='" + topLeftX + '\'' +
                "topLeftY='" + topLeftY + '\'' +
                "bottomRightX='" + bottomRightX + '\'' +
                "bottomRightY='" + bottomRightY + '\'' +
                "creator='" + creator + '\'' +
                "createTime='" + createTime + '\'' +
                "updator='" + updator + '\'' +
                "updateTime='" + updateTime + '\'' +
            '}';
    }

}
