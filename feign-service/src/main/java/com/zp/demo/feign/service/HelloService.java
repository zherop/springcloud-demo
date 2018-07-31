package com.zp.demo.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "HELLO-SERVICE")
public interface HelloService {
	@GetMapping("/hello/say")
	public String say();
}
