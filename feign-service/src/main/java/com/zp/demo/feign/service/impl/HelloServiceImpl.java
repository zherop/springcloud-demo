package com.zp.demo.feign.service.impl;

import org.springframework.stereotype.Component;

import com.zp.demo.feign.service.HelloService;

@Component
public class HelloServiceImpl implements HelloService {

	@Override
	public String say() {
		return "sorry.";
	}

}
