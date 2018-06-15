package com.pingan.fi.common.client;

import com.pingan.fi.common.CommonResponse;
import com.pingan.fi.common.ResponseList;
//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author IonCannon
 * @date 2018/6/15
 * @decription : content
 */

public interface DatabaseService {

    @PostMapping("/feature/update")
    default CommonResponse updateFeatureById(@RequestParam(value = "body") Map body){
        return ResponseList.DEFAULT_FAIL_MESSAGE.getResponse("updateById failed",null);
    };

    @PostMapping(value="/feature/insertBatch")
    default CommonResponse insertFeatureBatch(){
        return ResponseList.DEFAULT_FAIL_MESSAGE.getResponse("insertBatch failed",null);
    }

}


