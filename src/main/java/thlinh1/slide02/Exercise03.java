package thlinh1.slide02;

/*
Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a
number in a row. The pattern is as follows :

   1
  222
 33333
4444444
 33333
  222
   1
*/

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soDong;
        System.out.println("Nhập số dòng để vẽ hình tam giác");
        System.out.print("Nhập số dòng : ");
        soDong = scan.nextInt();
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((i + 1));
            }
            System.out.println();
        }
    }
}