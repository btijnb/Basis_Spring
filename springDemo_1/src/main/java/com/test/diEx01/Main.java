package com.test.diEx01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

  public static void main(String[] args) {

    //　　 ＊依存関係設定しない場合
    //		MyGetSum myGetSum = new MyGetSum();
    //		myGetSum.setGetsum(new GetSum());
    //
    //		myGetSum.setA(10);
    //		myGetSum.setB(100);

    AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:getsum.xml");
    MyGetSum myGetSum = ctx.getBean("myGetSum", MyGetSum.class);

    myGetSum.sum();
  }
}
