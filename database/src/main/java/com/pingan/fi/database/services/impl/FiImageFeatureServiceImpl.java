package com.pingan.fi.database.services.impl;

import com.pingan.fi.common.CommonResponse;
import com.pingan.fi.common.ResponseList;
import com.pingan.fi.database.dao.FiImageFeatureMapper;
import com.pingan.fi.database.model.FiImageFeature;
import com.pingan.fi.database.services.FiImageFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FiImageFeatureServiceImpl implements FiImageFeatureService {

    @Autowired
    private FiImageFeatureMapper fiImageFeatureMapper;

    public CommonResponse findById(String featureId){
        FiImageFeature fiImageFeature=new FiImageFeature();
        fiImageFeature.setId(Long.parseLong(featureId));

        List<FiImageFeature> featureList = fiImageFeatureMapper.queryFiImageFeature(fiImageFeature);

        CommonResponse response=  ResponseList.DEFAULT_SUCCESS_MESSAGE.getResponse();
        response.setData(featureList);
        return response;
    }
}
