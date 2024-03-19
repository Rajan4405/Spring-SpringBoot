package com.leranspring.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.leranspring.learnspringframework.game.GameRunner;
import com.leranspring.learnspringframework.game.GamingConsole;

@Configuration
@ComponentScan("com.leranspring.learnspringframework.game")
public class GamingAppLauncherApplication {

  public static void main(String[] args) {
    try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
      context.getBean(GamingConsole.class).up();
      context.getBean(GameRunner.class).run();
    }
  }
}
