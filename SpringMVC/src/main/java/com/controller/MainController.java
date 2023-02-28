package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
//	@RequestMapping("/home")
//	public String home(HttpServletRequest request) {
//		request.setAttribute("id", 1);
//		request.setAttribute("name", "java");
//		return "home";
//	}
	@RequestMapping("/home")
	public String home(HttpServletRequest request) {
//		m.addAttribute("id", 1);
//		m.addAttribute("name", "java");
		request.setAttribute("id", 1);
		request.setAttribute("name", "java");
		return "home";
	}
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
}
