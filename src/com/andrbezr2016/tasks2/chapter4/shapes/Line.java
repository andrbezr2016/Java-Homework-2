package com.andrbezr2016.tasks2.chapter4.shapes;

import com.andrbezr2016.tasks2.chapter2.Point;

import java.util.Objects;

public class Line extends Shape {

    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    public Point getFrom() {
        return getPoint();
    }

    public void setFrom(Point from) {
        setPoint(from);
    }

    public Point getTo() {
        return to;
    }

    public void setTo(Point to) {
        this.to = to;
    }

    @Override
    public void moveBy(double dX, double dY) {
        super.moveBy(dX, dY);
        to = to.translate(dX, dY);
    }

    @Override
    public Point getCenter() {
        double xCenter = (getPoint().getX() + to.getX()) / 2;
        double yCenter = (getPoint().getY() + to.getY()) / 2;
        return new Point(xCenter, yCenter);
    }

    @Override
    public String toString() {
        return "Line[" +
                "from" + getPoint() +
                ", to=" + to +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Line line = (Line) o;
        return Objects.equals(to, line.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), to);
    }

    @Override
    public Line clone() {
        return (Line) super.clone();
    }
}
