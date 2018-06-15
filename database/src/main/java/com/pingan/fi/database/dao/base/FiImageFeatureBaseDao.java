package com.pingan.fi.database.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.pingan.fi.database.model.FiImageFeature;
/**
*  @author author
*/
public interface FiImageFeatureBaseDao {

    int insertFiImageFeature(FiImageFeature object);

    int updateFiImageFeature(FiImageFeature object);

    List<FiImageFeature> queryFiImageFeature(FiImageFeature object);

    FiImageFeature queryFiImageFeatureLimit1(FiImageFeature object);

}