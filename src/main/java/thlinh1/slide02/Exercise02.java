package thlinh1.slide02;

/*
Write a program in Java to display the cube of the number up to give an integer.
Test Data
Input number of terms : 4
Expected Output :

Number is : 1 and Cube of 1 is : 1
Number is : 2 and Cube of 2 is : 8
Number is : 3 and Cube of 3 is : 27
Number is : 4 and Cube of 4 is : 64

*/

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soNguyen;
        System.out.println("Tìm số lập phương của số nguyên và những số nhỏ hơn số nguyên nhưng lớn hơn 0");
        System.out.print("Nhập số nguyên : ");
        soNguyen = scan.nextInt();
        for (int i = 1; i <= soNguyen; i++) {
            System.out.println("Number is : " + i + " and Cube of " + i + " is : " + (int)Math.pow(i, 3));
        }


    }
}