package com.pingan.fi.database.services;

import com.pingan.fi.common.CommonResponse;
import com.pingan.fi.common.ResponseList;
import com.pingan.fi.database.dao.FiImageFeatureMapper;
import com.pingan.fi.database.model.FiImageFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author IonCannon
 * @date 2018/6/12
 * @decription : content
 */
@Service
public class DemoService {
    @Autowired
    FiImageFeatureMapper fiImageFeatureMapper;

    public CommonResponse doDemoSelect(String featureId){
        FiImageFeature fiImageFeature=new FiImageFeature();
        fiImageFeature.setId(Long.parseLong(featureId));

        List<FiImageFeature> featureList = fiImageFeatureMapper.queryFiImageFeature(fiImageFeature);

        CommonResponse response=  ResponseList.DEFAULT_SUCCESS_MESSAGE.getResponse();
        response.setData(featureList);
        return response;
    }
}
