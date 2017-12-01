package com.spring.bbsController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.bbsCommand.Bcmd;

import com.spring.bbsCommand.ListCmd;

import com.spring.bbsVO.BVO;
import com.spring.template.StaticTemplate;

@Controller
public class BController {
	Bcmd cmd = null;
	
	private JdbcTemplate template;

	@Autowired //MEMO servlet-context.xmlに作られているbeanを自動注入
	public void setTemplate(JdbcTemplate template){ //MEMO 新たなコンストラクターではない
		this.template=template;
		StaticTemplate.template=this.template; //MEMO 他のクラスとtemplateを共有するためstatic
	}
	
	@RequestMapping("/list")
	public String list(Model model){
		System.out.println("-------------- list() 呼ぶ ---------------------");
		cmd = new ListCmd();
		cmd.service(model); 
		
		return "list";
	}

	
	
	@ModelAttribute("BVO")
	public BVO formBacking(){ //QUESTION これは何の為？消してもいいか
		return new BVO();
	}
	
}
