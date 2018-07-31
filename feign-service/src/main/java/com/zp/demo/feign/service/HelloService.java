package com.zp.demo.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.zp.demo.feign.service.impl.HelloServiceImpl;

@FeignClient(value = "HELLO-SERVICE", fallback = HelloServiceImpl.class)
public interface HelloService {
	@GetMapping("/hello/say")
	public String say();
}
