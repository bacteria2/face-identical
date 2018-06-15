package com.pingan.fi.algorithm.client;

import com.pingan.fi.algorithm.model.fi.ImageFeatureModel;
import com.pingan.fi.common.CommonResponse;
import com.pingan.fi.common.ResponseList;
import com.pingan.fi.common.client.DatabaseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author IonCannon
 * @date 2018/6/15
 * @decription : content
 */
//@FeignClient(value = "database-service",fallback = DatabaseServiceErrorHandler.class)
public interface AlgorithmDataService extends DatabaseService {

    @PostMapping(value = "/feature/insertBatch",headers = "Content-Type:application/json")
    default CommonResponse insertFeatureBatch( List<ImageFeatureModel> body) {
        return ResponseList.DEFAULT_FAIL_MESSAGE.getResponse("updateById failed",null);
    }
}

class DatabaseServiceErrorHandler implements DatabaseService{

}