package com.pingan.fi.database.controller;

import com.pingan.fi.common.CommonResponse;
import com.pingan.fi.database.services.FiImageFeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author IonCannon
 * @date 2018/6/12
 * @decription : content
 */
@RestController
public class FiImageFeatureController {
    @Autowired
    private FiImageFeatureService fiImageFeatureService;


    @GetMapping("/demo/query/{id}")
    public CommonResponse findById(@PathVariable("id") String id){
        return fiImageFeatureService.findById(id);
    }
}
