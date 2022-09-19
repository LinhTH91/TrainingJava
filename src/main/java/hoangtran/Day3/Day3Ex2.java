package hoangtran.Day3;

import java.util.Scanner;

public class Day3Ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số ");
        int a = sc.nextInt();

        for (int i = 1; i <= a;i++) {
            System.out.println("Number is "+ i + " and Cube of "+i+" is :"+ i * i * i );
        }
    }
}
