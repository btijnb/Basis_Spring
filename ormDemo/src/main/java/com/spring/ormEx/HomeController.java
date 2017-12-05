package com.spring.ormEx;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.ormDAO.BDAO;
import com.spring.ormDAO.BbsDAO;

@Controller
public class HomeController {
	
	@Autowired
	BbsDAO bbsdao;
	
	@Autowired
	private SqlSession sqlSession;
		//MEMO SqlSessionTemplateはSqlSession interfaceをimplement
		//MEMO Type hierarchyはCommand + Tで確認

	@RequestMapping("/list")
	public String list(Model model){
		BDAO bdao = sqlSession.getMapper(BDAO.class);
		model.addAttribute("list", bdao.list());
		return "/list";
	}	
	
//	@RequestMapping("/list")
//	public String list(Model model){
//		ArrayList<BVO> bvos=bbsdao.list();
//		model.addAttribute("list", bvos);
//		return "/list";
//	}
	
}
