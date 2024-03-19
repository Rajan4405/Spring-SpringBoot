package com.leranspring.learnspringframework;

import com.leranspring.learnspringframework.game.MarioGame;
import com.leranspring.learnspringframework.game.GameRunner;

public class AppGamingBasicJava {
  public static void main(String[] args) {
    var marioGame = new MarioGame();
    var gameRunner = new GameRunner(marioGame);
    var superContraGame = new com.leranspring.learnspringframework.game.SuperContraGame();
    var gameRunnerSuperContra = new GameRunner(superContraGame);
    gameRunner.run();
    gameRunnerSuperContra.run();
  }
}
