package com.ty.test;


import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * @info 远程调用接口工具类
 */
public class InterfaceUtils {

    /**
     * 调用接口
     *
     * @param path 远程接口
     * @param obj  发送数据
     * @return 返回结果
     */
    public static CloseableHttpResponse interfaceTranslate(String path, String obj) {

        HttpPost httpPost = null;
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse httpResponse = null;
        try {
            httpClient = HttpClients.createDefault();
            httpPost = new HttpPost(path);
            httpPost.setEntity(new StringEntity(obj,
                    ContentType.create("application/json", "UTF-8")));
            httpResponse = httpClient.execute(httpPost);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        return httpResponse;
    }
}
