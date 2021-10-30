package com.andrbezr2016.taskshorstmann.chapter1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Task 1
        System.out.println("==Task 1==");
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        t1(num);
        // Task 2
        System.out.println("==Task 2==");
        System.out.print("Enter the angle: ");
        int angle = scanner.nextInt();
        t2v1(angle);
        t2v2(angle);
        // Task 3
        System.out.println("==Task 3==");
        System.out.print("Enter 3 numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        t3v1(num1, num2, num3);
        t3v2(num1, num2, num3);
        // Task 4
        System.out.println("==Task 4==");
        t4();
        // Task 6
        System.out.println("==Task 6==");
        t6(1000);
        // Task 13
        System.out.println("==Task 13==");
        t13();
    }

    /*
    Write a program that reads an integer and prints it in binary, octal, and
    hexadecimal. Print the reciprocal as a hexadecimal floating-point number.
     */
    public static void t1(int num) {
        System.out.println("Binary number: " + Integer.toBinaryString(num));
        System.out.println("Octal number: " + Integer.toOctalString(num));
        System.out.println("Hexadecimal number: " + Integer.toHexString(num));
        System.out.println("Hexadecimal floating-point number: " + Double.toHexString(num));
    }

    /*
    Write a program that reads an integer angle (which may be positive or
    negative) and normalizes it to a value between 0 and 359 degrees. Try
    it first with the % operator, then with floorMod.
     */
    public static void t2v1(int angle) {
        int normalizedAngle = angle >= 0 ? angle % 360 : ((-angle / 360 + 1) * 360 + angle) % 360;
        System.out.println("Normalized angle (% version): " + normalizedAngle);
    }

    public static void t2v2(int angle) {
        int normalizedAngle = Math.floorMod(angle, 360);
        System.out.println("Normalized angle (Math.floorMod() version): " + normalizedAngle);
    }

    /*
    Using only the conditional operator, write a program that reads three
    integers and prints the largest. Repeat with Math.max.
     */
    public static void t3v1(int num1, int num2, int num3) {
        int maxNum = num2;
        if (num1 > num2) {
            maxNum = num1;
        }
        if (num3 > maxNum) {
            maxNum = num3;
        }
        System.out.println("Max number (Conditional operator version): " + maxNum);
    }

    public static void t3v2(int num1, int num2, int num3) {
        int maxNum = Math.max(Math.max(num1, num2), num3);
        System.out.println("Max number (Math.max() version): " + maxNum);
    }

    /*
    Write a program that prints the smallest and largest positive double values.
    Hint: Look up Math.nextUp in the Java API.
     */
    public static void t4() {
        System.out.println("Smallest positive double values: " + Double.MIN_VALUE);
        System.out.println("Largest positive double values: " + Double.MAX_VALUE);
    }

    /*
    Write a program that computes the factorial n! = 1 × 2 × . . . × n, using
    BigInteger. Compute the factorial of 1000.
     */
    public static void t6(int num) {
        if (num < 0) {
            System.out.println("Wrong argument: negative number");
            return;
        }
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(new BigInteger(Integer.toString(i)));
        }
        System.out.println(num + "! = " + factorial);
    }

    /*
    Write a program that prints a lottery combination, picking six distinct
    numbers between 1 and 49. To pick six distinct numbers, start with an
    array list filled with 1...49. Pick a random index and remove the element.
    Repeat six times. Print the result in sorted order.
     */
    public static void t13() {
        ArrayList<Integer> numbers = new ArrayList<>(49);
        for (int i = 1; i <= 49; i++) {
            numbers.add(i);
        }
        TreeSet<Integer> selectedNumbers = new TreeSet<>();
        for (int i = 0; i < 6; i++) {
            selectedNumbers.add(numbers.remove((int) (Math.random() * (49 - i))));
        }
        System.out.println("Lottery combination: " + selectedNumbers);
    }
}
