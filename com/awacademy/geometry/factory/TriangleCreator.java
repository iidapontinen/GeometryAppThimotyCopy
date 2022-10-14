package com.awacademy.geometry.factory;

import com.awacademy.geometry.base.Point;
import com.awacademy.geometry.base.Shape;
import com.awacademy.geometry.base.ShapeCreator;
import com.awacademy.geometry.shapes.Square;
import com.awacademy.geometry.shapes.Triangle;

import java.util.Scanner;

public class TriangleCreator implements ShapeCreator {
    @Override
    public Shape askDataAndCreateShape(Scanner sc) {
        System.out.println("x-coordinate of upper corner?");
        int x = sc.nextInt();
        System.out.println("y-coordinate of upper corner?");
        int y = sc.nextInt();
        System.out.println("Length of side 1?");
        int length1 = sc.nextInt();
        System.out.println("Length of side 2?");
        int length2 = sc.nextInt();
        System.out.println("Length of side 3?");
        int length3 = sc.nextInt();
        Point corner1 = new Point(x, y);
        Triangle triangle = new Triangle(corner1, length1, length2, length3);
        return triangle;
    }
}