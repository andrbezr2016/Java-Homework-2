package com.andrbezr2016.tasks2.chapter4.shapes;

import com.andrbezr2016.tasks2.chapter2.Point;

import java.util.Objects;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    public Point getTopLeft() {
        return getPoint();
    }

    public void setTopLeft(Point topLeft) {
        setPoint(topLeft);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public Point getCenter() {
        double xCenter = getPoint().getX() + width / 2;
        double yCenter = getPoint().getY() + height / 2;
        return new Point(xCenter, yCenter);
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "topLeft" + getPoint() +
                ", width=" + width +
                ", height=" + height +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, height);
    }

    @Override
    public Rectangle clone() {
        return (Rectangle) super.clone();
    }
}
