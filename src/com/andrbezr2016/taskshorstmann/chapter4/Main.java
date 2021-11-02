package com.andrbezr2016.taskshorstmann.chapter4;

import com.andrbezr2016.taskshorstmann.chapter2.Point;
import com.andrbezr2016.taskshorstmann.chapter4.shapes.Circle;
import com.andrbezr2016.taskshorstmann.chapter4.shapes.Line;
import com.andrbezr2016.taskshorstmann.chapter4.shapes.Rectangle;

public class Main {
    public static void main(String[] args) {
        // Task 4
        System.out.println("==Task 4==");
        Circle circle = new Circle(new Point(1, 1), 2.5);
        Rectangle rectangle = new Rectangle(new Point(- 1, 1), 3, 3);
        Line line = new Line(new Point(0, 0), new Point(2, 4));
        System.out.println(circle + " center: " + circle.getCenter());
        System.out.println(rectangle + " center: " + rectangle.getCenter());
        System.out.println(line + " center: " + line.getCenter());
        line.moveBy(10, -10);
        System.out.println(line + " center: " + line.getCenter());
        // Task 5
        System.out.println("==Task 5==");
        Line newLine = line.clone();
        System.out.println("newLine != line: " + (newLine != line));
        System.out.println("newLine.getClass() == line.getClass(): " + (newLine.getClass() == line.getClass()));
        System.out.println("newLine.equals(line): " + newLine.equals(line));
        newLine.setTo(new Point(0, 0));
        System.out.println("newLine.equals(line): " + newLine.equals(line));
        newLine.setFrom(new Point(0, 0));
        System.out.println("newLine.equals(line): " + newLine.equals(line));
    }
}
