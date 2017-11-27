package com.spring.bbsController;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.bbsCommand.Bcmd;

import com.spring.bbsCommand.ListCmd;

import com.spring.bbsVO.BVO;

@Controller
public class BController {
	Bcmd cmd = null;
	
	

	
	@RequestMapping("/list")
	public String list(Model model){
		System.out.println("-------------- list() 呼ぶ ---------------------");
		cmd = new ListCmd();
		cmd.service(model); 
		
		return "list";
	}

	
	
	@ModelAttribute("BVO")
	public BVO formBacking(){
		return new BVO();
	}
	
}
