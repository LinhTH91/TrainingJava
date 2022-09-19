package thlinh1.slide02;

/*
Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise,
print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it
exceeds 1,000,000.
Test Data
Input a number: 25
Expected Output :
Input value: 25
Positive number
*/

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        float soThuc;
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số thực :");
        soThuc = scan.nextFloat();

        if (soThuc == 0) {
            System.out.println("===> Số nhập vào là zero");
        }
        if (soThuc > 0) {
            if (Math.abs(soThuc) < 1) {
                System.out.println("===> Số nhập vào là số thực small");
            } else if (soThuc > 1000000) {
                System.out.println("===> Số nhập vào là số thực large");
            } else {
                System.out.println("===> Số nhập vào là số thực positive");
            }
        } else if (soThuc < 0) {
            if (Math.abs(soThuc) < 1) {
                System.out.println("===> Số nhập vào là số thực small");
            } else {
                System.out.println("===> Số nhập vào là số thực negative");
            }
        }
    }
}