package com.zhq.httpdemo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhq.httpdemo.dto.VoucherSaleInfo;
import com.zhq.httpdemo.dto.VoucherSaleInfoResp;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.CollectionUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: http-demo
 * @description:
 * @author: ZHQ
 * @create: 2019-09-05 11:30
 **/
@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/json/test1")
    public String test1() {
        List<String> raiNoList = new ArrayList<>();
        raiNoList.add("99999999");
        raiNoList.add("99999998");
        raiNoList.add("99999997");
        raiNoList.add("99999996");
        String url = "http://99.248.1.8/tuna/yummy/voucher/saleInfo";

        MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        params.add("userId", "33f545d14s401c67923e712");
        params.add("vouNoList", raiNoList);
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(params, requestHeaders);
        VoucherSaleInfoResp resp = restTemplate.postForObject(url, requestEntity, VoucherSaleInfoResp.class);
        if (!resp.isSuccess()) {
        }
        if (CollectionUtils.isEmpty(resp.getResult())) {
        }


        return "success";
    }

    @RequestMapping("/json/test2")
    public String test2() throws JsonProcessingException {
        List<String> raiNoList = new ArrayList<>();
        raiNoList.add("99999999");
        raiNoList.add("99999998");
        raiNoList.add("99999997");
        raiNoList.add("99999996");
        String url = "http://99.248.1.8/tuna/yummy/voucher/saleInfo";

        Map<String, Object> map = new HashMap<>();
        map.put("userId", "33f545d14s401c67923e712");
        map.put("vouNoList", raiNoList);
        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(map);


        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> formEntity = new HttpEntity<String>(str, headers);

        VoucherSaleInfoResp resp = restTemplate.postForObject(url, formEntity, VoucherSaleInfoResp.class);
        System.out.println(resp);

        return "success";
    }

/*    public static void main(String[] args) throws JsonProcessingException {
        Map<String, Object> map = new HashMap<>();
        List<String> raiNoList = new ArrayList<>();
        raiNoList.add("99999999");
        raiNoList.add("99999998");
        raiNoList.add("99999997");
        raiNoList.add("99999996");
        map.put("userId", "33f545d14s401c67923e712");
        map.put("vouNoList", raiNoList);

        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(map);
        System.out.println(str);
    }*/


}
