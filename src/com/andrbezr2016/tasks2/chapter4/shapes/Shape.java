package com.andrbezr2016.tasks2.chapter4.shapes;

import com.andrbezr2016.tasks2.chapter2.Point;

import java.util.Objects;

/*
Define an abstract class Shape with an instance variable of class Point, a
constructor, a concrete method public void moveBy(double dx, double dy) that
moves the point by the given amount, and an abstract method public Point
getCenter(). Provide concrete subclasses Circle, Rectangle, Line with constructors
public Circle(Point center, double radius), public Rectangle(Point topLeft, double width,
double height), and public Line(Point from, Point to).

Define clone methods for the classes of the preceding exercise.
 */
abstract public class Shape implements Cloneable {

    private Point point;

    public Shape(Point point) {
        this.point = point;
    }

    protected Point getPoint() {
        return point;
    }

    protected void setPoint(Point point) {
        this.point = point;
    }

    public void moveBy(double dX, double dY) {
        point = point.translate(dX, dY);
    }

    abstract public Point getCenter();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(point, shape.point);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point);
    }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(getClass() + " are not Cloneable!");
        }
    }
}
