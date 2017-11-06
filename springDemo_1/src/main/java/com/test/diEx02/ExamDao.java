package com.test.diEx02;

public class ExamDao {
	private String msg;
		
	public ExamDao(){	//基本生成：講座では「；」つけたけど、それはミステークだと思う。
	}
	
	public ExamDao(String msg){ //因子生成子
		this.msg=msg;
	}
	
	public void outputMsg(){
		System.out.println("msg: "+msg);
	}
}
