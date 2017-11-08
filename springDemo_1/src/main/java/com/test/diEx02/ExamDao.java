package com.test.diEx02;

public class ExamDao {
  private String msg;

  public ExamDao() { //MEMO 基本生成：講座では「；」つけたけど、これはミステーク
  }

  public ExamDao(String msg) { //MEMO 因子生成子
    this.msg = msg;
  }

  public void outputMsg() {
    System.out.println("msg: " + msg);
  }
}
