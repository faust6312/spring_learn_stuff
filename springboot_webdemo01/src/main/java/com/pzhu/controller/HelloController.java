package com.pzhu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	@RequestMapping("/t1")
	public String test1(Model model){
		//存入数据
		model.addAttribute("msg","Hello,Thymeleaf");
		//classpath:/templates/test.html
		return "test";
	}




//
//	@GetMapping("/test")
//	public String test(){
//	return "test";//test被解析->加上前缀和html后缀

}
