package com.zhq.picture.demo.dto;

/**
 * @author : ZHQ
 * @date : 2019/11/27
 */
public class ChatResult {
    private String code;
    private String msg;
    private ReceiveMessageBody data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ReceiveMessageBody getData() {
        return data;
    }

    public void setData(ReceiveMessageBody data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ChatResult{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
