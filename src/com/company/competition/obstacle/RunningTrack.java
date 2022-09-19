package com.company.competition.obstacle;

import com.company.competition.particiant.Participant;

/**
 * Created by Chernykh on 17.09.2022
 */
public class RunningTrack extends Obstacle {

  public RunningTrack(int size, String title) {
    super(size, title);
  }

  @Override
  public boolean overCome(Participant participant) {
    boolean b = participant.getLimitRun() >= getSize();
    participant.run();
    if (b) {
      System.out.println("Участник " + participant.getName() + " успешно преодолел препятствие "
          + getTitle() + " длиной " + getSize() + " м.\n");
    } else {
      System.out.println("Участник " + participant.getName() + " не преодолел препятствие "
          + getTitle() + " и выбывает из соревнования. Пройдено значение "
          + participant.getLimitRun() + " м.\n");
    }
    return b;
  }
}