package com.company.competition.particiant;

/**
 * Created by Chernykh on 17.09.2022
 */
public abstract class Participant {
  private  String name;
  public int limitRun;
  public int limitjump;

  public Participant(String name, int limitRun, int limitjump) {
    this.name = name;
    this.limitRun = limitRun;
    this.limitjump = limitjump;
  }

  public void run(){
    System.out.println("Я бегу");
  }
  public void jump(){
    System.out.println("Я прыгаю...");
  }
}
