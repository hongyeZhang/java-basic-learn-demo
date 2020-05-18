package com.zhq.jarlearndemo.fastjson;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @program: jar-learn-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-09-17 19:58
 **/
public class User {
    private Long   id;

    private String name;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
