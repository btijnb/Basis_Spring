package com.spring.bbsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.spring.bbsVO.BVO;

public class BDAO {
	
	DataSource dataSource;
	
	public BDAO(){
		try {
			Context ctx=new InitialContext();
			dataSource= (DataSource) ctx.lookup("java:com/env/jdbc/scottDB");
		}catch(NamingException e){
			e.printStackTrace();
		}
	}
	
  public ArrayList<BVO> list() {
    ArrayList<BVO> bVOs = new ArrayList<BVO>();
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    
    try{
    		connection = dataSource.getConnection();
    		String sql="select bNo, bName, bSubject, bHit, bGroup, bStep, bIndent from mvc_bbs_temporary order by bGroup desc, bStep asc";
    		preparedStatement = connection.prepareStatement(sql);
    		resultSet=preparedStatement.executeQuery();
    		
    		while(resultSet.next()){
    			String bNo=resultSet.getString("bNo");
    			String bSubject=resultSet.getString("bName");
    			String bContent=resultSet.getString("bContent");
    			String bDate=resultSet.getString("bDate");
    			
    			
    			
    					}
    }
    return bVOs;
  }
}
