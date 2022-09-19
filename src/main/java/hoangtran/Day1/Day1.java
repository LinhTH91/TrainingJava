package hoangtran.Day1;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        int a = 74;
        int b = 36;
        int sum = a + b;

        System.out.println("Ex1 : ");
        System.out.println(sum);
        System.out.println("--------");

        int x = -5 + 8 * 6;
        int y = (55 + 9) % 9;
        int z = 20 + (-3) * 5 / 8;
        int w = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("Ex2 :");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
        System.out.println("--------");

        System.out.println("Ex4 :");
        Scanner sc = new Scanner(System.in);
        int firstInput = sc.nextInt();
        int secondInput = sc.nextInt();
        if (firstInput == secondInput) {
            System.out.println("0");
        } else if (firstInput % 6 == secondInput % 6) {
            System.out.println(Math.min(firstInput,secondInput));
        }else {
            System.out.println(Math.max(firstInput,secondInput));
        }
    }
}
