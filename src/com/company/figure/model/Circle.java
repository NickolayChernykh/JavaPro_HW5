package com.company.figure.model;

import static java.lang.Math.*;
import com.company.figure.api.Squareable;


/**
 * Created by Chernykh on 14.09.2022
 */
public class Circle implements Squareable {

  private int radCircle;

  public Circle(int radCircle) {
    this.radCircle = radCircle;
  }

  @Override
  public double calculateSpace() {
    return PI * pow(radCircle, 2);
  }
}
