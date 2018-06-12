package com.pingan.fi.database.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.pingan.fi.database.model.FiImageFeature;

/**
*  @author author
*/
@Mapper
public interface FiImageFeatureMapper{

    int insertFiImageFeature(FiImageFeature object);

    int updateFiImageFeature(FiImageFeature object);

    List<FiImageFeature> queryFiImageFeature(FiImageFeature object);

    FiImageFeature queryFiImageFeatureLimit1(FiImageFeature object);

}