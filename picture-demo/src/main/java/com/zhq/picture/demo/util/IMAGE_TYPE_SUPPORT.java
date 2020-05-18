//-------------------------------------------------------------------------------------
//CMB O2O Confidential
//
//Copyright (C) 2016 China Merchants Bank Co., Ltd. O2O All rights reserved.
//
//No part of this file may be reproduced or transmitted in any form or by any means,
//electronic, mechanical, photocopying, recording, or otherwise, without prior
//written permission of China Merchants Bank Co., Ltd. O2O
//
//-------------------------------------------------------------------------------------

package com.zhq.picture.demo.util;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * Created by tp on 2017/11/22.
 */
public enum IMAGE_TYPE_SUPPORT {
    GIF("gif", "474946", 3, 4 * 1024 * 1024, "gif"),
    JPEG("jpeg", "FFD8FF", 3, 101 * 1024, "jpeg,jpg"),
    PNG("png", "89504E47", 4, 101 * 1024, "png");

    IMAGE_TYPE_SUPPORT(String contentType, String headInfo, int headLen, int sprtSize, String suffix) {
        this.contentType = contentType;
        this.headInfo = headInfo;
        this.headLen = headLen;
        this.sprtSize = sprtSize;
        this.suffix = suffix;
    }

    private String contentType;
    private String headInfo;
    private int    headLen;
    private int    sprtSize;
    private String suffix;

    public String getContentType() {
        return contentType;
    }

    public String getHeadInfo() {
        return headInfo;
    }

    public int getHeadLen() {
        return headLen;
    }

    public int getSprtSize() {
        return sprtSize;
    }

    public String getSuffix() {
        return suffix;
    }

    public static IMAGE_TYPE_SUPPORT supportType(String contentType, String suffix) {
        for (IMAGE_TYPE_SUPPORT item : IMAGE_TYPE_SUPPORT.values()) {
            // 判断文件头
            if (!StringUtils.isEmpty(contentType) && (contentType.contains(item.getContentType()) || contentType.contains(item.getContentType().toUpperCase()))) {
                // 判断文件名后缀
                if(Arrays.asList(item.getSuffix().split(",")).contains(suffix)) {
                    return item;
                }
            }
        }
        
        return null;
    }
}
