package com.andrbezr2016.tasks2.chapter4.shapes;

import com.andrbezr2016.tasks2.chapter2.Point;

import java.util.Objects;

public class Circle extends Shape {

    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return getPoint();
    }

    public void setCenter(Point center) {
        setPoint(center);
    }

    @Override
    public String toString() {
        return "Circle[" +
                "center=" + getCenter() +
                ", radius=" + radius +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    @Override
    public Circle clone() {
        return (Circle) super.clone();
    }
}
