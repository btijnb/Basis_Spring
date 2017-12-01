package com.spring.bbsDAO;


import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.bbsVO.BVO;
import com.spring.template.StaticTemplate;

public class BDAO {
	
	JdbcTemplate template;
	
	public BDAO(){	
		this.template=StaticTemplate.template;		
	}
	
	
  public ArrayList<BVO> list() {
	  ArrayList<BVO> bVOs=null;
	String sql = "select bNo, bName, bSubject, bContent, bDate, bHit, bGroup, bStep, bIndent from mvc_bbs_temporary"
				+ " order by bGroup desc, bStep asc";	  
	bVOs=(ArrayList<BVO>)template.query(sql, new BeanPropertyRowMapper<BVO>(BVO.class));
	  return bVOs;
  }
    
}
