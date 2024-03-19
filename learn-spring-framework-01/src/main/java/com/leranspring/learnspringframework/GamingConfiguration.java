package com.leranspring.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.leranspring.learnspringframework.game.GameRunner;
import com.leranspring.learnspringframework.game.GamingConsole;
import com.leranspring.learnspringframework.game.MarioGame;

@Configuration
public class GamingConfiguration {
  @Bean
  public GamingConsole game() {
    var game = new MarioGame();
    return game;
  }

  @Bean
  public GameRunner gameRunner(GamingConsole game) {
    var gameRunner = new GameRunner(game);
    return gameRunner;
  }

}
