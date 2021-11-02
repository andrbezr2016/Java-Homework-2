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
        System.out.println("Average salary: " + Measurable.average(employees));
        // Task 2
        System.out.println("==Task 2==");
        System.out.println("The Employee with the largest salary: " + Measurable.largest(employees));
    }
}
