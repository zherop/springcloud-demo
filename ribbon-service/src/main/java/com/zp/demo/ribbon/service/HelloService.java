package com.zp.demo.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author zherop@163.com
 * @date 2018年7月30日
 */
@Service
public class HelloService {
	@Autowired
	RestTemplate restTemplate;

	public String say() {
		return restTemplate.getForObject("http://HELLO-SERVICE/hello/say", String.class);
	}
}
