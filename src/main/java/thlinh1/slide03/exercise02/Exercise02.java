package thlinh1.slide03.exercise02;

/*
Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length
and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area
of the rectangle. Length and breadth of rectangle are entered through keyboard.
*/

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float length, breadth;
        System.out.println("Tính toán diện tích khu đất dựa trên độ dài độ rộng");
        System.out.print("Nhập độ dài  : ");
        length = scan.nextFloat();
        System.out.print("Nhập độ rộng : ");
        breadth = scan.nextFloat();
        Area area = new Area(length, breadth);
        System.out.println("===> Diện tích khu đất là : " + area.returnArea() + " kilomet vuông");
    }
}