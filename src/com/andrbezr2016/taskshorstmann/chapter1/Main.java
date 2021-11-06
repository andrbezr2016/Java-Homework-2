package com.andrbezr2016.taskshorstmann.chapter1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Task 1
        System.out.println("==Task 1==");
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        Tasks.t1(num);
        // Task 2
        System.out.println("==Task 2==");
        System.out.print("Enter the angle: ");
        int angle = scanner.nextInt();
        System.out.println("Normalized angle (% version): " + Tasks.t2v1(angle));
        System.out.println("Normalized angle (Math.floorMod() version): " + Tasks.t2v2(angle));
        // Task 3
        System.out.println("==Task 3==");
        System.out.print("Enter 3 numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Max number (Conditional operator version): " + Tasks.t3v1(num1, num2, num3));
        System.out.println("Max number (Math.max() version): " + Tasks.t3v2(num1, num2, num3));
        // Task 4
        System.out.println("==Task 4==");
        Tasks.t4();
        // Task 6
        System.out.println("==Task 6==");
        System.out.println(num + "! = " + Tasks.t6(1000));
        // Task 13
        System.out.println("==Task 13==");
        System.out.println("Lottery combination: " + Tasks.t13());
    }
}
