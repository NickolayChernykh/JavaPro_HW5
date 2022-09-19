package com.company.competition.particiant;

/**
 * Created by Chernykh on 17.09.2022
 */
public class Human extends Participant {

  public Human(String name, int limitRun, int limitjump) {
    super(name, limitRun, limitjump);
  }


  @Override
  public void run() {
    System.out.println("Человек бежит");
  }

  @Override
  public void jump() {
    System.out.println("Человек прыгает");
  }
}
