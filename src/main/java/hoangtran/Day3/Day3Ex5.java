package hoangtran.Day3;

import java.util.Scanner;

public class Day3Ex5 {
    public static void main(String[] args) {
        float sum = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số : ");
        int inputNumber = sc.nextInt();
        for (float i = 1; i <= inputNumber; i++) {
            if(i % 2 ==0) {
                 sum =  sum - 1/i;
            }else {
                 sum = sum + 1/i;
            }
        }
        System.out.println(sum);

    }

}
