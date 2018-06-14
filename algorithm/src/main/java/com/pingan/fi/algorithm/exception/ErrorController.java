package com.pingan.fi.algorithm.exception;

import com.pingan.fi.common.CommonResponse;
import com.pingan.fi.common.ResponseList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author IonCannon
 * @date 2018/6/12
 * @decription : content
 */
@RestControllerAdvice
public class ErrorController {

    private Logger log = LoggerFactory.getLogger(ErrorController.class);

    @ExceptionHandler(value = Exception.class)
    public CommonResponse errorHandler(Exception ex) {
        log.error("服务器内部错误: ", ex);
        return ResponseList.DEFAULT_FAIL_MESSAGE.getResponse(String.format("服务器内部错误,Exception:%s Message:%s",ex.getClass(), ex.getMessage()), null);
    }
}
