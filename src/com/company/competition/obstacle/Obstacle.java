package com.company.competition.obstacle;

import com.company.competition.api.Surmountable;
import com.company.competition.particiant.Participant;

/**
 * Created by Chernykh on 19.09.2022
 */
public abstract class Obstacle implements Surmountable {

  private final int size;
  private final String title;

  public Obstacle(int size, String title) {
    this.size = size;
    this.title = title;
  }

  @Override
  public abstract boolean overCome(Participant participant);

  public int getSize() {
    return size;
  }

  public String getTitle() {
    return title;
  }
}
