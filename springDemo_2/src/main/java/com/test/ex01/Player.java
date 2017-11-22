package com.test.ex01;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Player implements InitializingBean, DisposableBean {

  private String name;
  private int age;

  public Player() {}

  public Player(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("Bean生成時処理する命令");
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("Bean消滅時処理する命令");
  }
}
