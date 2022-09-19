package com.company.figure.model;

import static java.lang.Math.*;

import com.company.figure.api.Squareable;

/**
 * Created by Chernykh on 14.09.2022
 */
public class Triangle implements Squareable {

  private int a;
  private int b;
  private int c;
  private int sp;

  public Triangle(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;


  }

  @Override
  public double calculateSpace() {
    double sp = (a + b + c) / 2.0;
    return sqrt(sp * (sp - a) * (sp - b) * (sp - c)); // формула Герона
  }
}
