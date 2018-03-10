package com.fuzamei.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/hello")
	public String helloworld(){
		return "helloworld";
	}
	@RequestMapping("/hehe")
	public String hehe(){
		return "呵呵";
	}
	@RequestMapping("/hoho")
	public String hoho(){
		return "吼吼";
	}
}
