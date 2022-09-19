package hoangtran.Day3;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số : ");
        float inputNum = sc.nextFloat();
        System.out.println("Input Value : "+ inputNum);

        if(inputNum==0) {
            System.out.println("Zero");
        }
        if(inputNum != 0) {
            if(inputNum > 0) {
                System.out.println("Positive Number");
            }else {
                System.out.println("Negative Number");
            }
        }
        if(Math.abs(inputNum) < 1 ) {
            System.out.println("Small");
        }
        if(Math.abs(inputNum) > 1.000000f) {
            System.out.println("Large");
        }
    }
}
