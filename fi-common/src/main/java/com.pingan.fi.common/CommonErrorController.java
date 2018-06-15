package com.pingan.fi.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;



public class CommonErrorController {

    private Logger log = LoggerFactory.getLogger(CommonErrorController.class);

    @ExceptionHandler(value = Exception.class)
    public CommonResponse errorHandler(Exception ex) {
        log.error("服务器内部错误: ", ex);
        return ResponseList.DEFAULT_FAIL_MESSAGE.getResponse(String.format("服务器内部错误,Exception:%s Message:%s",ex.getClass(), ex.getMessage()), null);
    }
}