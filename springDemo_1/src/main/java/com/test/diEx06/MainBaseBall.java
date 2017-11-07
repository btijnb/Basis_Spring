package com.test.diEx06;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainBaseBall {

  public static void main(String[] args) {
	  String confLoc="classpath:baseBall1.xml";
	  AbstractApplicationContext ctx = new GenericXmlApplicationContext(confLoc);
	  
	  Player player1=ctx.getBean("player1", Player.class);
	  System.out.println(player1.getName());
	  
	  ctx.close();
  }
}
