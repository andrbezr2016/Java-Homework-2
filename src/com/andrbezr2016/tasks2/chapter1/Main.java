package com.andrbezr2016.tasks2.chapter1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Task 1
        System.out.println("==Task 1==");
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        Tasks.convertNumber(num);
        // Task 2
        System.out.println("==Task 2==");
        System.out.print("Enter the angle: ");
        int angle = scanner.nextInt();
        System.out.println("Normalized angle (% version): " + Tasks.convertAngle1(angle));
        System.out.println("Normalized angle (Math.floorMod() version): " + Tasks.convertAngle2(angle));
        // Task 3
        System.out.println("==Task 3==");
        System.out.print("Enter 3 numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Max number (Conditional operator version): " + Tasks.max1(num1, num2, num3));
        System.out.println("Max number (Math.max() version): " + Tasks.max2(num1, num2, num3));
        // Task 4
        System.out.println("==Task 4==");
        Tasks.printPositiveDoubleBounds();
        // Task 6
        System.out.println("==Task 6==");
        System.out.println("0! = " + Tasks.factorial(0));
        System.out.println("1! = " + Tasks.factorial(1));
        System.out.println("6! = " + Tasks.factorial(6));
        System.out.println("1000! = " + Tasks.factorial(1000));
        // Task 13
        System.out.println("==Task 13==");
        System.out.println("Lottery combination: " + Tasks.getCombination());
    }
}
