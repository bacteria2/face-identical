package com.pingan.fi.database.controller;

import com.pingan.fi.common.CommonResponse;
import com.pingan.fi.common.ResponseList;
import com.pingan.fi.database.model.FiImageFeature;
import com.pingan.fi.database.services.FiImageFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author IonCannon
 * @date 2018/6/12
 * @decription : content
 */
@RestController
public class FiImageFeatureController {
    @Autowired
    private FiImageFeatureService fiImageFeatureService;

    @PostMapping("/feature/update")
    public CommonResponse updateFeature(@RequestBody FiImageFeature fiImageFeature) {
        fiImageFeatureService.updateFeature(fiImageFeature);
        return ResponseList.DEFAULT_SUCCESS_MESSAGE.getResponse();
    }

    @PostMapping("/feature/insertBatch")
    public CommonResponse insertFeature(@RequestBody List<FiImageFeature> list) {
        fiImageFeatureService.insertFeatureBatch(list);
        return ResponseList.DEFAULT_SUCCESS_MESSAGE.getResponse();
    }

    @GetMapping("/feature/fetch/{libId}")
    public CommonResponse queryAllFeature(@PathVariable("libId") String libId) {
        if("-1".equals(libId) || StringUtils.isEmpty(libId)){
            return ResponseList.DEFAULT_SUCCESS_MESSAGE.getResponseWithData(fiImageFeatureService.queryAllImageList());
        }
        return  ResponseList.DEFAULT_SUCCESS_MESSAGE.getResponseWithData(fiImageFeatureService.queryListByLibIdByLibId(libId));

    }

    @GetMapping("/feature/query/{imageId}")
    public CommonResponse queryFeatureByImageId(@PathVariable("imageId") String imageId) {
        return ResponseList.DEFAULT_SUCCESS_MESSAGE.getResponseWithData(fiImageFeatureService.queryImageById(imageId));
    }


}
