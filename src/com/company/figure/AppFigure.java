package com.company.figure;

import com.company.figure.api.Squareable;
import com.company.figure.model.Circle;
import com.company.figure.model.Square;
import com.company.figure.model.Triangle;

/**
 * Created by Chernykh on 14.09.2022
 */
public class AppFigure {

  public static void main(String[] args) {
    totalSqFigure();
  }
  static void totalSqFigure() {
    double totalSq = 0;
    Squareable[] arrFigures = {
        new Circle(5),
        new Square(7),
        new Triangle(4, 5, 6)};
    for (Squareable arrFigure : arrFigures) {
      totalSq += arrFigure.calculateSpace();

    }
    System.out.println("Сумма площадей всех фигур в этом массиве = " + totalSq);
  }

}


