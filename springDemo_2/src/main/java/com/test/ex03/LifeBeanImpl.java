package com.test.ex03;

import org.springframework.beans.factory.BeanNameAware;

public class LifeBeanImpl implements LifeBean, BeanNameAware {

  private String beanName; //MEMO ANYWAYREMEMBER 設定ファイルで、beanのidをセーブするための変数

  public void init() {
    System.out.println("ユーザー初期化メソッド");
  }

  public void end() {
    System.out.println("ユーザー消滅メソッド");
  }

  @Override
  public void lifeMethod() {
    System.out.println("ビジネスロジックを行います。");
    System.out.println("beanName: " + beanName);
  }

  @Override
  //bean objectが自分の名前を知る必要がある時使うメソッド
  //(オブジェクトが生成時、該当オブジェクトのId値を伝達(注入)してもらうメソッド)
  public void setBeanName(String beanName) {
    this.beanName = beanName;
  }
}
