package com.zjiet.api;

import org.springframework.stereotype.Component;

@Component
public class ResultGenerator {
    private static final String SUCCESS = "success";
    //成功
    public RestResult getSuccessResult() {
        RestResult result = new RestResult();
        result.setCode(200);
        result.setMessage(SUCCESS);
        return result;
    }
    //成功，附带额外数据
    public  RestResult getSuccessResult(Object data) {
        RestResult result = new RestResult();
        result.setCode(200);
        result.setMessage(SUCCESS);
        result.setData(data);
        return result;
    }
    //成功，自定义消息及数据
    public  RestResult getSuccessResult(String message,Object data) {
        RestResult result = new RestResult();
        result.setCode(200);
        result.setMessage(SUCCESS);
        result.setData(data);
        return result;
    }
    //失败，附带消息
    public  RestResult getFailResult(String message) {
        RestResult result = new RestResult();
        result.setCode(400);
        result.setMessage(message);
        return result;
    }
    //失败，自定义消息及数据
    public RestResult getFailResult(String message, Object data) {
        RestResult result = new RestResult();
        result.setCode(400);
        result.setMessage(message);
        result.setData(data);
        return result;
    }
    //自定义创建
    public RestResult getFreeResult(ResultCode code, String message, Object data) {
        RestResult result = new RestResult();
        result.setCode(code.code());
        result.setMessage(message);
        result.setData(data);
        return result;
    }
}
