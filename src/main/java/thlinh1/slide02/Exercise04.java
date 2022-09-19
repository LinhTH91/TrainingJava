package thlinh1.slide02;

/*
Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the
number is equal to the number itself, then the number is called an Armstrong number.
For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
*/

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soBatDau, soKetThuc;
        System.out.println("Viết chương trình để tìm tất cả số Armstrong trong phạm vi 3 chữ số");
        System.out.print("Nhập số bắt đầu  : ");
        soBatDau = scan.nextInt();
        System.out.print("Nhập số kết thúc : ");
        soKetThuc = scan.nextInt();
        if ((soBatDau < 100 || soKetThuc > 999) && soBatDau > soKetThuc) {
            System.out.println("===> Hệ thống không hỗ trợ việc tìm số Armstrong trong phạm vi này");
        }

        for (int i = soBatDau; i < soKetThuc; i++) {
            String chuoiSo = String.valueOf(i);
            int ketQua = 0;
            for (int j = 0; j < chuoiSo.length(); j++) {
                ketQua = ketQua + (int)Math.pow(Integer.parseInt(String.valueOf(chuoiSo.charAt(j))), 3);
            }
            if (chuoiSo.equals(String.valueOf(ketQua))) {
                System.out.println("===> " + chuoiSo + " là số Armstrong");
            }
        }
    }
}