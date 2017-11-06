package com.test.diEx03;

public class PersonInfo {
	private Person person;
	
	public PersonInfo(){		
	}
	
	public PersonInfo(Person person){
		this.person=person;
	}
	
	public void getPersonInfo(){
		if(person != null){
			System.out.println("名前："+person.getName());
			System.out.println("性別："+person.getGender());
			System.out.println("年齢："+person.getAge());
			System.out.println("住民番号："+person.getIdNo());
			System.out.println("-------------------------");
		}
	}
	
	public void setPerson(Person person){ //[Q] setPersonInfoの誤字？
		this.person=person;
	}

}
