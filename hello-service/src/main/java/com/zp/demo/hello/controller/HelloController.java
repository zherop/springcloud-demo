package com.zp.demo.hello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@Value("${spring.application.name}")
	private String serverName;

	public String say() {
		return "say hello from " + serverName;
	}
}
