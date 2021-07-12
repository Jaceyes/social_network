package com.zjiet.api;

import lombok.Data;

@Data
public class RestResult {
    private int code;//状态码

    private String message;//消息

    private Object data;//数据
}
