package com.awacademy.geometry.shapes;

import com.awacademy.geometry.base.Point;

public class Rectangle {

    // USe the same ideas
    Point topLeftCorner;
    int width;
    int height;

    public Rectangle(Point topLeftCorner, int width, int height) {
        this.topLeftCorner = topLeftCorner;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "topLeftCorner=" + topLeftCorner +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
