package com.spring.ormEx;

import java.util.ArrayList;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.ormDAO.BbsDAO;
import com.spring.ormVO.BVO;

@Controller
public class HomeController {
	
	@Autowired
	BbsDAO bbsdao;
	
	
	@RequestMapping("/list")
	public String list(Model model){
		ArrayList<BVO> bvos=bbsdao.list();
		model.addAttribute("list", bvos);
		return "/list";
	}
	
}
