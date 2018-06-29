package com.pingan.fi.algorithm.controller;

import com.google.common.base.Preconditions;
import com.pingan.fi.algorithm.engine.AlgorithmCastException;
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

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.Optional;


/**
 * @author IonCannon
 * @date 2018/6/11
 * @decription : content
 */
@RestController
@RequestMapping("/face")
public class FiController {

    @Autowired
    FiService fiService;

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

    @ApiOperation(value = "特征值新增", notes = "提交图片id，新增特征值")
    @PostMapping("/feature/add")
    public CommonResponse featureGenerate(@RequestBody List<ImageFeatureModel> idList) throws Exception {
        Preconditions.checkNotNull(idList,"图片列表为空");
        return fiService.featureGenerate(idList);
    }

    @ApiOperation(value = "1vN任务提交", notes = "提交图片id，新增特征值")
    @PostMapping("/search/1vN")
    public CommonResponse search1VN(@RequestBody Map<String,String> parameter) throws IOException, AlgorithmCastException {
        String imageId=parameter.get("imageId");
        Preconditions.checkNotNull(imageId );
        return fiService.search1VN(imageId,parameter.get("libIds"));
    }

    @ApiOperation(value = "人脸小图坐标查询", notes = "提交图片id，新增特征值")
    @GetMapping("/detect/{imageId}")
    public CommonResponse faceDetect(@PathVariable(value = "imageId") String imageId) throws Exception {

        return fiService.faceDetect(imageId);
    }


    @ApiOperation(value="修改算法调用接口,会获取调用者IP来确定完整hostname",notes = "修改算法接口， type为数据类型 0为1v1,1为1vn")
    @PostMapping("/config/fi-server/port")
    public CommonResponse serverPortChange(@RequestParam int type, @RequestParam String port,HttpServletRequest request)   throws UnknownHostException  {
        String remoteIp=getIpAddr(request);
        fiService.updateHostName(String.format("%s:%s",remoteIp,port),type);
        return ResponseList.DEFAULT_SUCCESS_MESSAGE.getResponse();
    }

    @ApiOperation(value="修改算法调用域名和接口",notes = "修改算法接口， type为数据类型 0为1v1,1为1vn，")
    @PostMapping("/config/fi-server/hostname")
    public CommonResponse serverHostnameChange(@RequestParam int type, @RequestParam String hostname){
        fiService.updateHostName(hostname,type);
        return ResponseList.DEFAULT_SUCCESS_MESSAGE.getResponse();
    }


    private  String getIpAddr(HttpServletRequest request) throws UnknownHostException {
        String ipAddress = request.getHeader("x-forwarded-for");
        if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("Proxy-Client-IP");
        }
        if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getRemoteAddr();
            if(ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")){
                //根据网卡取本机配置的IP
                InetAddress inet=InetAddress.getLocalHost();
                ipAddress= inet.getHostAddress();
            }
        }
        //对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
        if(ipAddress!=null && ipAddress.length()>15){ //"***.***.***.***".length() = 15
            if(ipAddress.indexOf(",")>0){
                ipAddress = ipAddress.substring(0,ipAddress.indexOf(","));
            }
        }
        return ipAddress;
    }


}
