package com.zhq.httpdemo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: http-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-09-17 18:57
 **/

@Data
public class LombokDto1 implements Serializable {
    private String name;
    private int age;

}
