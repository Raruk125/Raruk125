package com.example.demo.controller;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class AopSampleController {
	@Autowired
	HttpSession session;
	
	@RequestMapping(path = "/aoplogin", method = RequestMethod.GET)
	public String viewPage() {
		return "aopSample";
	}
	
	@RequestMapping(path = "/aoplogin", method = RequestMethod.POST)
	public String viewPage2(String name) {
		session.setAttribute("userName", name);
		return "aopSample2";
	}
}
