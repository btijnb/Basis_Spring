package com.spring.ormDAO;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spring.ormVO.BVO;

@Service //MEMO @Service: アノテーションが付与されたクラスをSpringのDIコンテナにbeanとして登録
public class BbsDAO implements BDAO{
	
	JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template){
		this.template = template;
	}
	
	@Override
	public ArrayList<BVO> list(){
		String sql="select * from mybatis_bbs_temporary";
		ArrayList<BVO> bvos = (ArrayList<BVO>)template.query(sql, 
				new BeanPropertyRowMapper<BVO>(BVO.class));
		
		return bvos;
	}
	
//	@Override
//	public void writeOk(final String bname, final String bContent){
//		System.out.println("writeOk() 호출--------");
//		
//		this.template.update(new PreparedStatementCreator(){
//			
//			@Override
//			public PreparedStatement createPreparedStatement(Connection con)
//			throws SQLException{
//				String sql = "insert into mybatis_bbs(bId, bName, bContent) "
//						+ "values(seq_mybatis_bbs.nextval,?,?)";
//				PreparedStatement ps = con.prepareStatement(sql);
//				ps.setString(1, bname);
//				ps.setString(2, bContent);
//				return ps;
//			}
//		});
//	}
//	
//	@Override
//	public void delete(String bId){
//		
//	}
	
	
	
	
}
