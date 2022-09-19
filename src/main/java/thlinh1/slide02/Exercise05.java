package thlinh1.slide02;

/*
Compute the natural logarithm of 2, by adding up to n terms in the series
1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
where n is a positive integer and input by user.
*/

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Tính toán theo công thức 1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n với n là số được nhập");
        System.out.print("Nhập số n : ");
        n = scan.nextInt();
        if (n <= 0) {
            System.out.println("===> Số n = " + n + " không phải là 1 số nguyên dương");
            System.exit(1);
        }

        int mauSoChung = 1;
        for (int i = 1; i <= n; i++) {
            mauSoChung = mauSoChung * i;
        }

        float ketQua = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                ketQua = ketQua + mauSoChung;
            } else if (i % 2 == 0) {
                ketQua = ketQua - mauSoChung / i;
            } else {
                ketQua = ketQua + mauSoChung / i;
            }
        }
        System.out.println("===> Kết quả: 1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/" + n + " = "+ (int)ketQua + "/" + mauSoChung + " = " + ketQua/mauSoChung);

    }
}