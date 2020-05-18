package com.zhq.httpdemo.dto;

import java.math.BigDecimal;

/**
 * @Author: ZHQ
 * @description:
 * @Date: 2019/9/3 15:23
 */
public class VoucherSaleInfo {
    /**
     * 抵扣券ID（非通用抵扣券）
     */
    private String voucherNo;

    /**
     * 用户在该抵扣券关联的所有商品或商户中的最大交易频次
     */
    private Long userMaxTradeTime;
    /**
     * 抵扣券关联的所有商品或商户中的最大销量
     */
    private Long relatedMaxSales;
    /**
     * 抵扣券转化率 = 使用率/发放率
     */
    private BigDecimal conversionRate;

    public VoucherSaleInfo() {
    }

    public VoucherSaleInfo(String voucherNo, Long userMaxTradeTime, Long relatedMaxSales, BigDecimal conversionRate) {
        this.voucherNo = voucherNo;
        this.userMaxTradeTime = userMaxTradeTime;
        this.relatedMaxSales = relatedMaxSales;
        this.conversionRate = conversionRate;
    }

    public String getVoucherNo() {
        return voucherNo;
    }

    public void setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo;
    }

    public Long getUserMaxTradeTime() {
        return userMaxTradeTime;
    }

    public void setUserMaxTradeTime(Long userMaxTradeTime) {
        this.userMaxTradeTime = userMaxTradeTime;
    }

    public Long getRelatedMaxSales() {
        return relatedMaxSales;
    }

    public void setRelatedMaxSales(Long relatedMaxSales) {
        this.relatedMaxSales = relatedMaxSales;
    }

    public BigDecimal getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }

    @Override
    public String toString() {
        return "VoucherSaleInfo{" +
                "voucherNo='" + voucherNo + '\'' +
                ", userMaxTradeTime=" + userMaxTradeTime +
                ", relatedMaxSales=" + relatedMaxSales +
                ", conversionRate=" + conversionRate +
                '}';
    }
}
