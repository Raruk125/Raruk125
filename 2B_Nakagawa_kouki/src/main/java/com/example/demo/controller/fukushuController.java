package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.repository.fukushuRepository;


@Controller
public class fukushuController {

	@Autowired
	fukushuRepository repository;
    
    @RequestMapping(path = "/jpaHukusyu", method = RequestMethod.GET)
    public String viewPage(Model model) {
        
    	
    	//or And の間にスペースはいらない
    	model.addAttribute("comps",repository.findByCompnumberOrCompname(1,"Syst"));
        
        // 表示するHTMLはreturnの後ろSに書く。
        // 今回の場合はtemplatesフォルダの中にあるsessionフォルダにあるlogin.htmlを表示する。
        return "jpaHukusyu";
    }
}