package com.test.di;

public class TestDAOImp implements TestDAO {
  //@Override [Q]なんでアノテーション消さなければならないんだろう
  public void printMsg() {
    System.out.println("TestDAOImpのprintMsg()メソッドです。");
  }
}
