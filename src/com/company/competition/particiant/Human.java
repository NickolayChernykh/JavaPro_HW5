package com.company.competition.particiant;

/**
 * Created by Chernykh on 17.09.2022
 */
public class Human extends Participant {

  public Human(String name, int limitRun, int limitJump) {
    super(name, limitRun, limitJump);
  }

  @Override
  public void run() {
    System.out.println("Человек " + getName() + " бежит");
  }

  @Override
  public void jump() {
    System.out.println("Человек " + getName() + " прыгает");
  }
}
