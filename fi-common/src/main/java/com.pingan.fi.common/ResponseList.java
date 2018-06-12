package com.pingan.fi.common;

/**
 * @author IonCannon
 * @date 2018/4/29
 * @decription : content
 */
public enum ResponseList {
    DEFAULT_SUCCESS_MESSAGE("success", 200),
    DEFAULT_FAIL_MESSAGE("fail", 500),
    DEFAULT_NOT_FOUND("service not found", 400),
    DB_ERROR_MESSAGE("Database Error", 501),
    SERVER_ERROR_MESSAGE("Server Error", 502);


    ResponseList(String msg, int code) {
        this.response = new CommonResponse(code, msg, null);
    }

    private CommonResponse response;

    public CommonResponse getResponse() {
        return (CommonResponse) response.clone();
    }

    public CommonResponse getResponse(String msg,Object data){
        CommonResponse response = getResponse();
        response.setData(data);
        response.setMessage(msg);
        return response;
    }

    public CommonResponse getResponseWithData(Object data) {
        return getResponse(this.response.getMessage(),data);
    }
}
