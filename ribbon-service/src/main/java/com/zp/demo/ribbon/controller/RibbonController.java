package com.zp.demo.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zp.demo.ribbon.service.HelloService;

/**
 * @author zherop@163.com
 * @date 2018年7月30日
 */
@RestController
@RequestMapping("/ribbon-hello")
public class RibbonController {
	@Autowired
	HelloService helloService;

	@GetMapping("/say")
	public String say() {
		return helloService.say();
	}
}
