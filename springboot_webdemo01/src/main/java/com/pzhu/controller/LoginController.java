package com.pzhu.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

@Controller
public class LoginController {
	@RequestMapping("/user/login")

	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
	                    Model model,HttpSession session){
		if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
			session.setAttribute("loginUser",username);//登录成功时存一个username的session
			return "redirect:/main.html";
		}else{
			model.addAttribute("msg","用户名或密码错误");
			return "index";
		}

	}
	@RequestMapping("/user/logout")
public String logout(HttpSession session){
		session.invalidate();

		return "redirect:/index.html";
}


}
