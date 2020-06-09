package com.test.controller;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.io.IOException;


@SpringBootTest
class HelloCtrollerTest {
    @Test
    public void TestHttpClient(){
        System.out.println("执行了");
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpget = new HttpGet("http://localhost:8080/GZTIMH/login?username=18785251621&password=123");
        try {
            String execute = httpClient.execute(httpget, new BasicResponseHandler());
            System.out.println(execute);
        } catch (IOException e) {
            e.printStackTrace();
        };
    }
}