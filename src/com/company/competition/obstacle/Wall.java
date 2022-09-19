package com.company.competition.obstacle;

import com.company.competition.particiant.Participant;

/**
 * Created by Chernykh on 17.09.2022
 */
public class Wall extends Obstacle {

  public Wall(int size, String title) {
    super(size, title);
  }

  @Override
  public boolean overCome(Participant participant) {
    boolean b = participant.getLimitJump() >= getSize();
    participant.jump();
    if (b) {
      System.out.println("Участник " + participant.getName() + " успешно преодолел препятствие "
          + getTitle() + " высотой " + getSize() + " м.\n");
    } else {
      System.out.println("Участник " + participant.getName() + " не преодолел препятствие "
          + getTitle() + " и выбывает из соревнования. Удалось подпрыгнуть на высоту "
          + participant.getLimitJump() + " м.\n");
    }
    return b;
  }
}
