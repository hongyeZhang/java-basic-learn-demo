package com.zhq.httpdemo.dto;

import java.util.List;

/**
 * @Author: ZHQ
 * @description:
 * @Date: 2019/9/4 14:00
 */
public class VoucherSaleInfoResp {
    private boolean success;
    private String errorCode;
    private String message;
    private List<VoucherSaleInfo> result;

    public VoucherSaleInfoResp() {
    }

    public VoucherSaleInfoResp(boolean success, String errorCode, String message, List<VoucherSaleInfo> result) {
        this.success = success;
        this.errorCode = errorCode;
        this.message = message;
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<VoucherSaleInfo> getResult() {
        return result;
    }

    public void setResult(List<VoucherSaleInfo> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "VoucherSaleInfoResp{" +
                "success=" + success +
                ", errorCode='" + errorCode + '\'' +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
