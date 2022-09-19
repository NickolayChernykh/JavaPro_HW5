package com.company.competition;

import com.company.competition.obstacle.Obstacle;
import com.company.competition.obstacle.RunningTrack;
import com.company.competition.obstacle.Wall;
import com.company.competition.particiant.Cat;
import com.company.competition.particiant.Human;
import com.company.competition.particiant.Participant;
import com.company.competition.particiant.Robot;


/**
 * Created by Chernykh on 19.09.2022
 */
public class Main {

  public static void main(String[] args) {
    Participant[] arrParticipant =
        {new Human("Sam", 200, 1),
            new Cat("Oscar", 30, 1),
            new Robot("Amigo", 2000, 10)};
    Obstacle[] arrObstacle =
        {new RunningTrack(100, "беговая дорожка"),
            new Wall(5, "стена")};

    for (Participant part :
        arrParticipant) {
      for (Obstacle obs :
          arrObstacle) {
        if (!obs.overCome(part)) {
          break;
        }
      }
    }
  }
}

