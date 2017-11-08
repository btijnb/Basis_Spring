package com.test.diEx08;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {

  @Bean
  public Player player1() {
    ArrayList<String> position = new ArrayList<String>();
    position.add("4番打者");
    position.add("3塁手");

    Player player = new Player("パクビョンホ", 28, position);
    player.setHeight(187);
    player.setWeight(80);

    return player;
  }
}
