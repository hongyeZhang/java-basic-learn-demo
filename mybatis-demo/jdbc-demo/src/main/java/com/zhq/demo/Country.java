package com.zhq.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: mybatis-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-10-16 22:07
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    private Integer id;
    private String countryname;
    private String countrycode;
}
