package com.andrbezr2016.tasks2.chapter2;

public class Main {
    public static void main(String[] args) {
        // Task 5
        System.out.println("==Task 5==");
        Point point1 = new Point(3, 4);
        Point point2 = point1.translate(1, 3);
        Point point3 = point2.scale(0.5);
        System.out.println("Point1: " + point1);
        System.out.println("translate(1, 3)");
        System.out.println("Point2: " + point2);
        System.out.println("scale(0.5)");
        System.out.println("Point3: " + point3);
        // Task 9
        System.out.println("==Task 9==");
        Car car = new Car(2.5);
        System.out.println("Gas level: " + car.getGas());
        printDrive(car, 10);
        car.addGas(20);
        System.out.println("Gas level: " + car.getGas());
        printDrive(car, 10);
        printDrive(car, -5);
        System.out.println("Gas level: " + car.getGas());
        System.out.println("Current position: " + car.getDistance());
    }

    public static void printDrive(Car car, double dDistance) {
        dDistance = car.driveDistance(dDistance);
        if (dDistance != 0) {
            System.out.println("The car has driven " + dDistance + " miles on the x-axis.");
        } else {
            System.out.println("There is not enough gas.");
        }
    }
}
