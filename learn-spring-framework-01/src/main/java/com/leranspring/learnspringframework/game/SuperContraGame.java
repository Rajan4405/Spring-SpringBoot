package com.leranspring.learnspringframework.game;

public class SuperContraGame implements GamingConsole {
  public void up(){
    System.out.println("up");
  }
  public void down(){
    System.out.println("Sit down");
  }
  public void left(){
    System.out.println("Go Back");
  }
  public void right(){
    System.out.println("shoot a bullet");
  }
}