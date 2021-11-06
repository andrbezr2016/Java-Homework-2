package com.andrbezr2016.taskshorstmann.chapter1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public final class Tasks {

    private Tasks() {
    }

    /*
    Task 1
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
    Task 2
    Write a program that reads an integer angle (which may be positive or
    negative) and normalizes it to a value between 0 and 359 degrees. Try
    it first with the % operator, then with floorMod.
     */
    public static int t2v1(int angle) {
        return angle >= 0 ? angle % 360 : ((-angle / 360 + 1) * 360 + angle) % 360;
    }

    public static int t2v2(int angle) {
        return Math.floorMod(angle, 360);
    }

    /*
    Task 3
    Using only the conditional operator, write a program that reads three
    integers and prints the largest. Repeat with Math.max.
     */
    public static int t3v1(int num1, int num2, int num3) {
        int maxNum = num2;
        if (num1 > num2) {
            maxNum = num1;
        }
        if (num3 > maxNum) {
            maxNum = num3;
        }
        return maxNum;
    }

    public static int t3v2(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    /*
    Task 4
    Write a program that prints the smallest and largest positive double values.
    Hint: Look up Math.nextUp in the Java API.
     */
    public static void t4() {
        System.out.println("Smallest positive double values: " + Double.MIN_VALUE);
        System.out.println("Largest positive double values: " + Double.MAX_VALUE);
    }

    /*
    Task 6
    Write a program that computes the factorial n! = 1 × 2 × . . . × n, using
    BigInteger. Compute the factorial of 1000.
     */
    public static BigInteger t6(int num) {
        if (num < 0) {
            return BigInteger.valueOf(-1);
        }
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    /*
    Task 13
    Write a program that prints a lottery combination, picking six distinct
    numbers between 1 and 49. To pick six distinct numbers, start with an
    array list filled with 1...49. Pick a random index and remove the element.
    Repeat six times. Print the result in sorted order.
     */
    public static Set<Integer> t13() {
        List<Integer> numbers = new ArrayList<>(49);
        for (int i = 1; i <= 49; i++) {
            numbers.add(i);
        }
        Set<Integer> selectedNumbers = new TreeSet<>();
        for (int i = 0; i < 6; i++) {
            selectedNumbers.add(numbers.remove((int) (Math.random() * (49 - i))));
        }
        return selectedNumbers;
    }
}
