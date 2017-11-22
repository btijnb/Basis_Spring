package com.spring.bbsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		Context ctx = new InitialContext();
		dataSource = (DataSource)ctx.lookup("java:comp/env/jdbc/scottDB");
	} catch (NamingException e) {
		e.printStackTrace();
		}
	}
	
  public ArrayList<BVO> list() {
    ArrayList<BVO> bVOs = new ArrayList<BVO>();
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;
    
    try{
		connection  = dataSource.getConnection();
		System.out.println("----------connection確保------------"); 
		String sql = "select bNo, bName, bSubject, bContent, bDate, bHit, bGroup, bStep, bIndent from mvc_bbs_temporary"
				+ " order by bGroup desc, bStep asc";
		preparedStatement = connection.prepareStatement(sql);
		resultSet = preparedStatement.executeQuery();
    		
		while(resultSet.next()){
		String bNo = resultSet.getString("bNo");
		String bName = resultSet.getString("bName");
		String bSubject = resultSet.getString("bSubject");
		String bContent = resultSet.getString("bContent");
		String bDate = resultSet.getString("bDate");
		
		int bHit = resultSet.getInt("bHit");
		int bGroup = resultSet.getInt("bGroup");
		int bStep = resultSet.getInt("bStep");
		int bIndent = resultSet.getInt("bIndent");
		
		BVO bVO = new BVO(bNo, bName, bSubject, bContent, bDate, bHit, bGroup, bStep, bIndent);
		bVOs.add(bVO);				
	}
} catch (SQLException e) {
	e.printStackTrace();
}finally{
	try {
		if(resultSet !=null) resultSet.close();
		if(preparedStatement !=null) preparedStatement.close();
		if(connection !=null) connection.close();
	} catch (Exception e2) {
		e2.printStackTrace();
	}
}		
return bVOs;
}
    
}
