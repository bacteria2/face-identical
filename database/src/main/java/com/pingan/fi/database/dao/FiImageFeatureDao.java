package com.pingan.fi.database.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.pingan.fi.database.model.FiImageFeature;


/**
 * @author author
 */
@Mapper
public interface FiImageFeatureDao {

    List<FiImageFeature> queryAllFeature(String libId);

    FiImageFeature queryFeatureByImageId(String imageId);

    void insertFeatureListBatch(List<FiImageFeature> list);

    int insertFiImageFeature(FiImageFeature object);

    int updateFiImageFeature(FiImageFeature object);
}