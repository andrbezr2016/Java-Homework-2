package com.andrbezr2016.taskshorstmann.chapter2;

/*
Implement a class Car that models a car traveling along the x-axis,
consuming gas as it moves. Provide methods to drive by a given number of
miles, to add a given number of gallons to the gas tank, and to get the
current distance from the origin and fuel level. Specify the fuel efficiency
(in miles/gallons) in the constructor. Should this be an immutable class?
Why or why not?
Я думаю этот класс не стоит делать неизменяемым, так как он описывает автомобиль,
а создавать новый автомобиль при каждом вызове методов driveDistance() и addGas()
не логично.
 */
public class Car {

    private double distance;
    private double gas;
    private double gasEfficiency;

    public Car(double gasEfficiency) {
        this.distance = 0.0;
        this.gas = 0.0;
        this.gasEfficiency = gasEfficiency;
    }

    public double getDistance() {
        return distance;
    }

    public double getGas() {
        return gas;
    }

    public double driveDistance(double dDistance) {
        double dGas = Math.abs(dDistance) / gasEfficiency;
        if (gas >= dGas) {
            gas -= dGas;
            distance += dDistance;
            return dDistance;
        }
        else {
            return 0;
        }
    }

    public void addGas(double dGas) {
        gas += dGas;
    }
}
