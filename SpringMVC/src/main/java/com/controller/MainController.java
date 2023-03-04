package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.UserDao;
import com.model.User;

@Controller
public class MainController {
	@Autowired
	private UserDao dao;

	@RequestMapping("/")
	public String index(Model m) {
		List<User> list = dao.getAllModel();
		m.addAttribute("list", list);
		return "index";
	}

	@RequestMapping("register")
	public RedirectView register(@ModelAttribute User u,HttpServletRequest request) {
		dao.inserUPdateUser(u);
		RedirectView view = new RedirectView();
		view.setUrl(request.getContextPath()+"/");
		return view;
	}
	
	@RequestMapping("/update/{id}")
	public String update(@PathVariable int id,Model m) {
		User u = dao.getModelById(id);
		m.addAttribute("u", u);
		return "update";
	}
	
	@RequestMapping("/delete/{id}")
	public RedirectView deleteUser(@PathVariable int id,HttpServletRequest request) {
		User u = dao.getModelById(id);
		dao.deleteModel(u);
		RedirectView view = new RedirectView();
		view.setUrl(request.getContextPath()+"/");
		return view;
	}

//	@RequestMapping("register")
//	public String register(HttpServletRequest request) {
//		String name=  request.getParameter("name");
//		long contact= Long.parseLong(request.getParameter("contact"));
//		String address = request.getParameter("address");
//		String email = request.getParameter("email");
//		String pass = request.getParameter("password");
//		System.out.println(name+contact+address+email+pass);
//		return "";
//	}

//	@RequestMapping("/home")
//	public String home(HttpServletRequest request) {
//		request.setAttribute("id", 1);
//		request.setAttribute("name", "java");
//		return "home";
//	}
	@RequestMapping("/home")
	public String home(Model m) {
		m.addAttribute("id", 1);
		m.addAttribute("name", "java");
//		request.setAttribute("id", 1);
//		request.setAttribute("name", "java");
		return "home";
	}

//	@RequestMapping("/about")
//	public String about() {
//		return "about";
//	}
	@RequestMapping("/adduser")
	public String AddUser() {
		return "adduser";
	}
}
