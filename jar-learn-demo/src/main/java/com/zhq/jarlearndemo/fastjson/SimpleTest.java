package com.zhq.jarlearndemo.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Date;

/**
 * @program: jar-learn-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-09-17 20:00
 **/
public class SimpleTest {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        User user = new User();
        user.setId(123L);
        user.setName("zhq");
        System.out.println(JSONObject.toJSON(user));

    }

    public static void serialize() {
        User user = new User();
        user.setId(11L);
        user.setName("西安");
        user.setCreateTime(new Date());
        String jsonString = JSON.toJSONString(user);
        System.out.println(jsonString);
    }

    public static void deserialize() {
        String jsonString = "{\"createTime\":\"2018-08-17 14:38:38\",\"id\":11,\"name\":\"西安\"}";
        User user = JSON.parseObject(jsonString, User.class);
        System.out.println(user.getName());
        System.out.println(user.getCreateTime());
    }
}
