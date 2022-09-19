package hoangtran.Day3;

import java.util.Scanner;

public class Day3Ex4 {

    public static boolean checkArmStrongNumbers(int x) {
        int copyOfX = x;
        int remainder;
        int result = 0;

        while (copyOfX != 0) {

            remainder  = copyOfX % 10;
            result += remainder * remainder * remainder;
            copyOfX = copyOfX / 10;
        }
        if(result == x ) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số ");
        int inputNumber = sc.nextInt();
        for (int i = 1; i <= inputNumber; i++) {
           if(checkArmStrongNumbers(i)) {
               System.out.println(i + " is Armstrong number");
           }
        }
    }
}
