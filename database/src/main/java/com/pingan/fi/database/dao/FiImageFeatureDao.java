package com.pingan.fi.database.dao;

import java.util.List;

import com.pingan.fi.database.dao.base.FiImageFeatureBaseDao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.pingan.fi.database.model.FiImageFeature;
import com.pingan.fi.database.dao.base.FiImageFeatureBaseDao;

/**
 * @author author
 */
@Mapper
public interface FiImageFeatureDao extends FiImageFeatureBaseDao {

    List<FiImageFeature> queryAllFeature(String libId);

    FiImageFeature queryFeatureByImageId(String imageId);

    void insertFeatureListBatch(List<FiImageFeature> list);
}