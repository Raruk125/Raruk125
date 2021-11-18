package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.repository.RenshuRepository;



@Controller
public class RenshuController {
    
	@Autowired
	RenshuRepository repository;

	
    @RequestMapping(path = "/jpaPractice", method = RequestMethod.GET)
    public String viewPage(Model model) {
        
    	model.addAttribute("shops",repository.findAll());
		
        // 表示するHTMLはreturnの後ろに書く。
        // 今回の場合はtemplatesフォルダの中にあるsessionフォルダにあるlogin.htmlを表示する。
        return "jpaPractice";
    }
}