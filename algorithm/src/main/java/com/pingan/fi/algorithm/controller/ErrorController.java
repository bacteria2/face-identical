package com.pingan.fi.algorithm.controller;

import com.pingan.fi.common.CommonResponse;
import com.pingan.fi.common.ResponseList;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author IonCannon
 * @date 2018/6/12
 * @decription : content
 */
@RestControllerAdvice
public class ErrorController {

    @ExceptionHandler(value = Exception.class)
    public CommonResponse errorHandler(Exception ex) {
        CommonResponse resp=    ResponseList.DEFAULT_FAIL_MESSAGE.getResponse();
        resp.setMessage(ex.getMessage());
        return resp;
    }
}
