package com.pzhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/con")
//@RequestMapping(value = "/con",method = {RequestMethod.GET})--->可以使用method属性指定请求类型

public class HelloController {

 @RequestMapping("/hello")
 public String sayHello(Model model){

  model.addAttribute("msg","hello,SpringMVCAnnotaton!");

	 return "/index.jsp";//重定向(redirect)-->此处为有视图解析器的情况下重定向。默认为转发
	 //如果没有视图解析器则转发要写全路径如-->return "/index.jsp";或者return "forward:/index.jsp";
	 //转发url不变，重定向url会变
  }

}
