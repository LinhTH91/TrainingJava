package thlinh1.slide01;


/*
Write a Java program to print the sum of two numbers.Test Data: 74 + 36 Expected Output : 110.
*/


import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soNguyen01, soNguyen02;
        System.out.println("Nhập 2 số nguyên để tính tổng");
        System.out.print("Nhập số thứ nhất : ");
        soNguyen01 = scan.nextInt();
        System.out.print("Nhập số thứ hai : ");
        soNguyen02 = scan.nextInt();
        System.out.print("==> Tổng hai số là : " + soNguyen01 + " + " + soNguyen02 + " = " + (soNguyen01 + soNguyen02));
    }
}