package com.test.diEx07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainBaseBall {
  public static void main(String[] args) {

    AnnotationConfigApplicationContext ctx =
        new AnnotationConfigApplicationContext(ConfigApp.class);

    Player player1 = ctx.getBean("player1", Player.class);
    System.out.println("選手名: " + player1.getName());
    System.out.println("年齢: " + player1.getAge());
    System.out.println("ポジション: " + player1.getPosition());
    System.out.println("身長: " + player1.getHeight());
    System.out.println("体重: " + player1.getWeight());

    System.out.println("================================");

    Player player2 = ctx.getBean("player2", Player.class);
    System.out.println("選手名: " + player2.getName());
    System.out.println("年齢: " + player2.getAge());
    System.out.println("ポジション: " + player2.getPosition());
    System.out.println("身長: " + player2.getHeight());
    System.out.println("体重: " + player2.getWeight());
  }
}
