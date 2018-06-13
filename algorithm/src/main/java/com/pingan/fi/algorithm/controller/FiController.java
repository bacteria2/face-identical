package com.pingan.fi.algorithm.controller;

import com.google.common.base.Preconditions;
import com.pingan.fi.algorithm.engine.impl.FiServiceExecutor;
import com.pingan.fi.algorithm.model.env.FiServerInfo;
import com.pingan.fi.algorithm.model.fi.ImageFeatureModel;
import com.pingan.fi.algorithm.services.FiService;
import com.pingan.fi.common.CommonResponse;
import com.pingan.fi.common.ResponseList;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;


/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : content
 */
@RestController
public class FiController {

    @Autowired
    FiService fiService;

    @ApiOperation(value = "1vN任务提交", notes = "提交任务，返回任务ID，根据任务ID查询结果")
    @PostMapping("/search/1vN")
    public CommonResponse taskSubmit(@RequestBody Map task){
        return null;
    }


    @ApiOperation(value = "1v1任务提交", notes = "提交1v1需要的数据，返回结果")
    @ApiImplicitParams({
            @ApiImplicitParam(value="待评估文件1_id",name="imageId1",required = true,dataType = "String"),
            @ApiImplicitParam(value="待评估文件2_id",name="imageId2",required = true,dataType = "String")
    })
    @PostMapping("/search/1v1")
    public CommonResponse search1V1(@RequestBody Map<String,String> task) throws Exception {

        String file1=task.get("imageId1");
        String file2=task.get("imageId2");

        Preconditions.checkNotNull(file1,"imageId1 is null");
        Preconditions.checkNotNull(file2,"imageId2 is null");

        return fiService.search1V1(file1,file2);
    }

    @PostMapping("/feature/add")
    public CommonResponse featureGenerate(@RequestBody List<ImageFeatureModel> idList) throws Exception {
        Preconditions.checkNotNull(idList,"图片列表为空");
        return fiService.featureGenerate(idList);
    }


    @GetMapping("/detect/{imageId}")
    public CommonResponse faceDetect(@PathVariable(value = "imageId") String imageId) throws Exception {

        return fiService.faceDetect(imageId);
    }



}
