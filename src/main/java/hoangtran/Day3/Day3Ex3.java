package hoangtran.Day3;

import java.util.Scanner;

public class Day3Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số : ");
        int a = sc.nextInt();
        for (int i = 1; i <=a ;i++){
            for (int j = 1 ;j <=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
