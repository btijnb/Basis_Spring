package com.test.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestMain {

  public static void main(String[] args) {

    String confLoc = "classpath:test.xml";
    AbstractApplicationContext ctx = new GenericXmlApplicationContext(confLoc);
    TestDAO testDao = ctx.getBean("TestDAOImp", TestDAOImp.class); //TestDAO Typeの…

    System.out.println("===========");
    testDao.printMsg();
    System.out.println("===========");
  }
}
