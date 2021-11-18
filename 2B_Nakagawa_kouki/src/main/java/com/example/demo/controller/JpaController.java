package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;

@Controller
public class JpaController {

	@Autowired
	ItemRepository repository;
	
	@RequestMapping(path = "/jpa", method = RequestMethod.GET)
	public String viewPage(Model model) {
		
		model.addAttribute("items",repository.findAll());
		
		// 表示するHTMLはreturnの後ろに書く。
		// 今回の場合はtemplatesフォルダの中にあるsessionフォルダにあるlogin.htmlを表示する。
		return "jpasample";
	}
	
	@RequestMapping(path = "/jpa", method = RequestMethod.POST)
    public String addPage(Model model,Integer id,String name,Integer price) {
    	
    	Item kudamono = new Item();
    	
    	kudamono.setId(id);
    	kudamono.setName(name);
    	kudamono.setPrice(price);
    	
    	repository.save(kudamono);
    	
    	model.addAttribute("items",repository.findAll());
    	
    	return "jpasample";
    }
}


