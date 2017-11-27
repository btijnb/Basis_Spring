package com.spring.validationEx;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("/memberForm")
	public String memberForm(){
		return "member/memInput";
	}
	
	@RequestMapping("/inputOK")
	public String inputOK(@ModelAttribute("member") Member member, BindingResult result){

		String viewName="memberOK";
		
		MemberValidator mValidator=new MemberValidator();
		mValidator.validate(member, result);
		
		if(result.hasErrors()){
			//return "redirect:memberForm";
			viewName="member/memInput";

		}
		
	    //return "memberOK";
		return viewName;

	}
}
