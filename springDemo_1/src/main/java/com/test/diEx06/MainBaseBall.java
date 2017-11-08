package com.test.diEx06;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainBaseBall {

  public static void main(String[] args) {
    String confLoc = "classpath:baseBall1.xml";
    String confLoc2 = "classpath:baseBall2.xml";

    AbstractApplicationContext ctx = new GenericXmlApplicationContext(confLoc, confLoc2);

    //Playerオブジェクト利用ケース
    Player player1 = ctx.getBean("player1", Player.class);
    System.out.println(player1.getName());
    System.out.println(player1.getPosition());

    //PlayerInfoオブジェクト利用ケース（この方法が望ましい）
    PlayerInfo playerInfo = ctx.getBean("playerInfo1", PlayerInfo.class);
    Player player2 = playerInfo.getPlayer();
    System.out.println(player2.getName());
    System.out.println(player2.getPosition());

    if (player1.equals(player2)) {
      System.out.println("player1とplayer2は同一人物です。");
    }

    Player player3 = ctx.getBean("player3", Player.class);
    System.out.println(player3.getName());
    System.out.println(player3.getPosition());

    //[Q]なんでnamespace使用して値入れた部分はprintできないんだろう？
    BaseBallTeam baseBallTeam = ctx.getBean("baseBallTeam", BaseBallTeam.class);
    System.out.println("-------------------------------");
    System.out.println("監督" + baseBallTeam.getManager());
    System.out.println("打撃コーチ" + baseBallTeam.getBattingCoach());
    System.out.println("投手コーチ" + baseBallTeam.getPitchingCoach());
    System.out.println("打者" + baseBallTeam.getHitter());
    System.out.println("投手" + baseBallTeam.getPitcher());

    ctx.close();
  }
}
