package com.andrbezr2016.taskshorstmann.chapter3;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("==Task 1==");
        Employee emp1 = new Employee(1, "Ivan", "C", 30000);
        Employee emp2 = new Employee(2, "Tom", "B", 56000);
        Employee emp3 = new Employee(3, "Petr", "A", 45000);
        Employee emp4 = new Employee(4, "Sofia", "G", 55000);
        Employee emp5 = new Employee(5, "Anna", "K", 35000);
        Employee[] employees = new Employee[]{emp1, emp2, emp3, emp4, emp5};
        System.out.println("Average salary: " + average(employees));
        // Task 2
        System.out.println("==Task 2==");
        System.out.println("The Employee with the largest salary: " + largest(employees));
    }

    /*
    Provide a method double average(Measurable[] objects) that computes the average
    measure. Use it to compute the average salary of an array of employees.
     */
    public static double average(Measurable[] objects) {
        if (objects != null && objects.length != 0) {
            double sum = 0;
            for (Measurable obj : objects) {
                sum += obj.getMeasure();
            }
            return sum / objects.length;
        }
        return 0;
    }

    /*
    Continue with the preceding exercise and provide a method Measurable
    largest(Measurable[] objects). Use it to find the name of the employee with
    the largest salary. Why do you need a cast?
     */
    public static Measurable largest(Measurable[] objects) {
        if (objects != null && objects.length != 0) {
            Measurable result = objects[0];
            for (Measurable obj : objects) {
                if (obj.getMeasure() > result.getMeasure()) result = obj;
            }
            return result;
        } else {
            return null;
        }
    }
}
