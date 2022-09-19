package com.company.competition.particiant;

import com.company.competition.particiant.Participant;

/**
 * Created by Chernykh on 17.09.2022
 */
public class Robot extends Participant {

  public Robot(String name, int limitRun, int limitjump) {
    super(name, limitRun, limitjump);
  }


  @Override
  public void run() {
    System.out.println("Робот бежит!");
  }

  @Override
  public void jump() {
    System.out.println("Робот прыгает");
  }
}
