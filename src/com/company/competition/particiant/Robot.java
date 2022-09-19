package com.company.competition.particiant;

/**
 * Created by Chernykh on 17.09.2022
 */
public class Robot extends Participant {

  public Robot(String name, int limitRun, int limitJump) {
    super(name, limitRun, limitJump);
  }

  @Override
  public void run() {
    System.out.println("Робот " + getName() + " бежит!");
  }

  @Override
  public void jump() {
    System.out.println("Робот " + getName() + " прыгает");
  }
}
