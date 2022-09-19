package com.company.figure.model;


import com.company.figure.api.Squareable;

/**
 * Created by Chernykh on 14.09.2022
 */
public class Square implements Squareable {

  private int a;

  public Square(int a) {
    this.a = a;
  }

  @Override
  public double calculateSpace() {
    return Math.pow(a, 2);
  }
}
