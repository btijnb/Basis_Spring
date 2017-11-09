package com.test.diEx03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainPerson {
  public static void main(String[] args) {
    String confLog = "classpath:person.xml";

    AbstractApplicationContext ctx = new GenericXmlApplicationContext(confLog);
    PersonInfo personInfo = ctx.getBean("personInfo", PersonInfo.class);
    personInfo.getPersonInfo();

    Person person = ctx.getBean("person2", Person.class);
    personInfo.setPerson(person);
    personInfo.getPersonInfo();

    ctx.close(); //resource leak防止 //MEMO
  }
}
