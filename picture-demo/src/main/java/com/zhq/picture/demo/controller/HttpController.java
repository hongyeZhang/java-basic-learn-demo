package com.zhq.picture.demo.controller;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ZHQ
 * @date : 2019/11/26
 */
@RestController
public class HttpController {
    private static final String ADMIN_KEY = "aWNzLWJpZy1jdXN0b21lci01MWVkNjZjNS1mMWVhLTRlMGUtYWMwZS0zNjQ1NTJkOTU3YzAtMTU3NDE0ODQ5MDM5OA==";
    private static final String ADMIN_SECRET = "60c8de8461f02fa9a4697d7799c5cb46";
    private static final String CUSTOMER_ID = "51ed66c5-f1ea-4e0e-ac0e-364552d957c0";
    private static final String ROBOT_SECRET = "2ceecb41bbca9e1f907c0b1ac843a751";
    /**
     * https://bot.4paradigm.com/v1/openapi/tenants/{tenantId}/robots/{robotId}/robot/ask
     */
    private static final String URI = "/v1/openapi/tenants/16419/robots/66ae372e-f644-4373-8806-66a3978e4eb7/robot/ask";



    @RequestMapping(value = "/http/test1")
    public String test1() {
        return "success";
    }

    public static void main(String[] args) {
        System.out.println(generateUrl());
    }

    public static String generateUrl() {
        String prefix = "https://bot.4paradigm.com/v1/openapi/tenants/16419/robots/66ae372e-f644-4373-8806-66a3978e4eb7/robot/ask?";
        String m1 = "adminkey=";
        String m2 = "&customerId=";
        String m3 = "&nonce=";
        String m4 = "&timestamp=";
        String m5 = "&sign=";
        String nonce = "123456";
        String timeStamp = String.valueOf(System.currentTimeMillis());

        String signInput = "adminkey:" + ADMIN_KEY + ",adminsecret:" + ADMIN_SECRET + ",customerId:" + CUSTOMER_ID
                + ",nonce:" + nonce + ",robotsecret:" + ROBOT_SECRET + ",timestamp:" + timeStamp + ",uri:" + URI;
        String sign = DigestUtils.md5Hex(signInput);

        return prefix + m1 + ADMIN_KEY + m2 + CUSTOMER_ID + m3 + nonce + m4 + timeStamp + m5 + sign;
    }

}
