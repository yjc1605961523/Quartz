package com.ty.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2021/1/8 10:52
 * @description：
 */
public class EprPost {
    public static void main(String[] args) {
        // 获得Http客户端(可以理解为:你得先有一个浏览器;注意:实际上HttpClient与浏览器是不一样的)
        CloseableHttpResponse response = InterfaceUtils.interfaceTranslate("http://121.36.89" +
                ".228:8089/ocserver/orderConnection","{\"orderItemList\":{\"6146\":1}," +
                "\"orderNo\":\"1347374410608148480\",\"orderPrice\":17776.00,\"paymentPrice\":15000.00," +
                "\"paymentWay\":\"2\",\"remark\":\"\",\"salesPrice\":15000.00,\"userAddress\":{\"cityId\":\"320300\"," +
                "\"cityName\":\"徐州市\",\"countyId\":\"320303\",\"countyName\":\"云龙区\"," +
                "\"createTime\":\"2021-01-07T18:27:18\",\"delFlag\":\"0\",\"detailInfo\":\"11\"," +
                "\"id\":\"1347127635892162562\",\"isDefault\":\"1\",\"postalCode\":\"\",\"provinceId\":\"320000\"," +
                "\"provinceName\":\"江苏省\",\"telNum\":\"1\",\"tenantId\":\"1\",\"updateTime\":\"2021-01-07T18:27:18\"," +
                "\"userId\":\"1346732869727739906\",\"userName\":\"1\"}}");
        StatusLine statusLine = response.getStatusLine();
        HttpEntity responseEntity = response.getEntity();
        if (statusLine.getStatusCode() != 200) {
            try {
                if (responseEntity != null) {
        
                    throw new RuntimeException(EntityUtils.toString(responseEntity));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {

            String s = EntityUtils.toString(responseEntity);
            System.out.println("=========="+ s);
            JSONObject parse = (JSONObject)JSON.parse(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
