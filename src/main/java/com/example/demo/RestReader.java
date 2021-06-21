package com.example.demo;

import java.io.BufferedInputStream;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class RestReader {
	
	private static final String BITTREX_BTC_USDT = "https://bittrex.com/api/v1.1/public/getmarketsummary?market=USDT-BTC";
	
	private static final String SINAJS_STOCK = "http://hq.sinajs.cn/list=sh600000";

	public static void main(String[] args) {

		try {
			CloseableHttpClient httpClient = HttpClientBuilder.create().build();
			HttpGet httpGetRequest = new HttpGet(SINAJS_STOCK);
			HttpResponse httpResponse = httpClient.execute(httpGetRequest);
			HttpEntity entity = httpResponse.getEntity();

			byte[] buffer = new byte[1024];
			if (entity != null) {
				InputStream inputStream = entity.getContent();
				try {
					int bytesRead = 0;
					BufferedInputStream bis = new BufferedInputStream(inputStream);
					while ((bytesRead = bis.read(buffer)) != -1) {
//						String chunk = new String(buffer, 0, bytesRead);
						String chunk = new String(buffer, "gbk");
						System.err.println(chunk);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
