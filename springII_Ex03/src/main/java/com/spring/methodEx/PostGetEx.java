package com.spring.methodEx;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostGetEx {
	
	@RequestMapping("/input") //MEMO 基本Get方式
	public String goPage(){
		return "inputForm";
	}
	
	@RequestMapping(value="/person", method=RequestMethod.POST)
	public String goPerson(HttpServletRequest request, Model model){
		String name=request.getParameter("name");
		String id=request.getParameter("id");
		
		System.out.println("name: "+name);
		System.out.println("id: "+id);
		
		model.addAttribute("name", name);
		model.addAttribute("id", id);
		
		return "person/personInfo";
		
	}
	
	@RequestMapping(value="/person", method=RequestMethod.GET)
	public ModelAndView goPerson(HttpServletRequest request){
		String name=request.getParameter("name");
		String id=request.getParameter("id");
		
		System.out.println("name: "+name);
		System.out.println("id: "+id);
		
		ModelAndView modelAndView = new ModelAndView(); //modelを使わずデータを渡すことができる
		
		modelAndView.setViewName("person/personInfo");
		modelAndView.addObject("name", name);
		modelAndView.addObject("id", id);
		
		return modelAndView;
	}
		
}
