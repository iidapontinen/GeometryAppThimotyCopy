package com.awacademy.geometry.shapes;

import com.awacademy.geometry.base.Point;
import com.awacademy.geometry.base.Shape;

import java.util.Scanner;

public class Triangle implements Shape {

    // USe the same ideas
    Point topCorner;
    int side1;
    int side2;
    int side3;

    public Triangle(Point topCorner, int side1, int side2, int side3) {
        this.topCorner = topCorner;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "topCorner=" + topCorner +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "Triangle{" +
//                "topLeftCorner=" + topLeftCorner +
//                ", width=" + width +
//                ", height=" + height +
//                '}';

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        return calculatePerimeter()/2;
    }

}