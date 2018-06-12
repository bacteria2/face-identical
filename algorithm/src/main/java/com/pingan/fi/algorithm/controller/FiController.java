package com.pingan.fi.algorithm.controller;

import com.google.common.base.Preconditions;
import com.pingan.fi.algorithm.model.env.FiServerInfo;
import com.pingan.fi.algorithm.services.FiService;
import com.pingan.fi.common.CommonResponse;
import com.pingan.fi.common.ResponseList;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
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

    @ApiOperation(value = "1vN任务查询", notes = "查询任务是否完成，如果完成返回任务详细信息")
    @ApiImplicitParam(name = "id", value = "任务ID", required = true, dataType = "String")
    @GetMapping("/query/{taskId}")
    public CommonResponse taskQuery(@PathVariable("taskId")String taskId){
        Preconditions.checkNotNull(taskId);
        return ResponseList.DEFAULT_SUCCESS_MESSAGE.getResponse();
    }
    @ApiOperation(value = "1vN任务提交", notes = "提交任务，返回任务ID，根据任务ID查询结果")
    @PostMapping("/search/1vN")
    public CommonResponse taskSubmit(@RequestBody Map task){
        return null;
    }

    @ApiOperation(value = "1v1任务提交", notes = "提交1v1需要的数据，返回结果")
    @PostMapping("/search/1v1")
    public CommonResponse search1V1(@RequestBody Map<String,String> task) throws Exception {
        //
        String file1=task.get("file1");
        String file2=task.get("file2");

        Preconditions.checkNotNull(file1,"file1 is null");
        Preconditions.checkNotNull(file2,"file2 is null");

        return fiService.search1V1(file1,file2);
    }


}
