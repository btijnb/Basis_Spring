package com.spring.validationEx;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class MemberValidator implements Validator{
	
	@Override
	public boolean supports(Class<?> arg0){
		return Member.class.isAssignableFrom(arg0);
	}

  @Override
  public void validate(Object obj, Errors errors) { 
	  	//MEMO mValidator.validate(member, result);
	  	//QUESTION なんでパラメーター名が違っても作動？
	  
	  System.out.println("-----validate()呼ぶ-----");
	  Member member=(Member)obj; //QUESTION ()って？
	  
	  String memName=member.getName();
	  if(memName==null||memName.trim().isEmpty()){
		  errors.rejectValue("name", "empty"); //MEMO .RejectValue for filedError, .Reject for Global Error
//		  System.out.println("会員の名前を入力しなさい");
//		  errors.rejectValue("name", "入力時エラー発生");
	  }
	  
	  String memId=member.getId();
	  if(memId==null||memId.trim().isEmpty()){
		  System.out.println("会員のIDを入力しなさい");
		  errors.rejectValue("id", "入力時エラー発生");
	  }
	  
	  int memNo=member.getMemNo();
	  if(memNo==0){
		  System.out.println("マイナンバーを入力しなさい");
		  errors.rejectValue("memNo", "入力時エラー発生");
	  }	  
	  
  }
}
