package com.pingan.fi.database.services;


import com.pingan.fi.database.dao.FiImageFeatureDao;
import com.pingan.fi.database.model.FiImageFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author IonCannon
 * @date 2018/6/14
 * @decription : content
 */
@Service
public class FiImageFeatureService {
    @Autowired
    FiImageFeatureDao fiImageFeatureDao;

    public List<FiImageFeature> queryAllImageList() {
        return fiImageFeatureDao.queryAllFeature(null);
    }

    public List<FiImageFeature> queryListByLibIdByLibId(String libId){
        return fiImageFeatureDao.queryAllFeature(libId);
    }

    public FiImageFeature queryImageById(String imageId) {
        return fiImageFeatureDao.queryFeatureByImageId(imageId);
    }

    public void updateFeature(FiImageFeature imageId) {
        fiImageFeatureDao.updateFiImageFeature(imageId);
    }


    public void insertFeatureBatch(List<FiImageFeature> fiImageFeatures) {
        fiImageFeatureDao.insertFeatureListBatch(fiImageFeatures);
    }


}
