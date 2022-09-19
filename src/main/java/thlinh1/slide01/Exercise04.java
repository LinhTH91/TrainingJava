package thlinh1.slide01;

/*
Write a Java program that accepts two integer values from the user and return the larger values. However, if
the two values are the same, return 0 and return the smaller value if the two values have the same remainder
when divided by 6.
Sample Output:
Input the first number : 12
Input the second number: 13
Result: 13
*/

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soNguyen01, soNguyen02;
        System.out.println("Nhập 2 số nguyên");
        System.out.print("Nhập số thứ nhất : ");
        soNguyen01 = scan.nextInt();
        System.out.print("Nhập số thứ hai  : ");
        soNguyen02 = scan.nextInt();

        if (soNguyen01 > soNguyen02) {
            System.out.println("===> Số nguyên thứ nhất lớn hơn : " + soNguyen01);
            if (soNguyen01 % 6 == soNguyen02 % 6) {
                System.out.println("===> Cả 2 số nguyên đều có phần dư khi chia cho 6 là giống nhau, số bé hơn là số nguyên thứ 2 : " + soNguyen02);
            }
        } else if (soNguyen01 < soNguyen02) {
            System.out.println("===> Số nguyên thứ hai lớn hon : " + soNguyen02);
            if (soNguyen01 % 6 == soNguyen02 % 6) {
                System.out.println("===> Cả 2 số nguyên đều có phần dư khi chia cho 6 là giống nhau, số bé hơn là số nguyên thứ 1 : " + soNguyen01);
            }
        } else {
            System.out.println("===> Số nguyên thứ nhất " + soNguyen01 + " và số nguyên thứ hai " + soNguyen02 + " là bằng nhau");
            System.out.println("===> Trả về 0");
        }
    }
}