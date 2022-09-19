package com.company.competition.particiant;

/**
 * Created by Chernykh on 17.09.2022
 */
public abstract class Participant {

  private String name;
  private int limitRun;
  private int limitJump;

  public Participant(String name, int limitRun, int limitJump) {
    this.name = name;
    this.limitRun = limitRun;
    this.limitJump = limitJump;
  }

  public void run() {
    System.out.println("Участник бежит...");
  }

  public void jump() {
    System.out.println("Участник прыгает...");
  }

  public String getName() {
    return name;
  }

  public int getLimitRun() {
    return limitRun;
  }

  public int getLimitJump() {
    return limitJump;
  }
}
