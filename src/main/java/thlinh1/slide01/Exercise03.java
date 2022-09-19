package thlinh1.slide01;

/*
Write a Java program to multiply two binary numbers.
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output
Product of two binary numbers: 110
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soNhiPhan01, soNhiPhan02, ketQua;
        System.out.println("Nhập 2 số nhị phân để tính tích");
        System.out.print("Nhập số nhị phân thứ nhất : ");
        soNhiPhan01 = scan.nextInt();
        kiemTraSoNhiPhanHopLe(soNhiPhan01);
        System.out.print("Nhập số nhị phân thứ hai : ");
        soNhiPhan02 = scan.nextInt();
        kiemTraSoNhiPhanHopLe(soNhiPhan02);

        ketQua = tinhTichHaiSoNhiPhan(soNhiPhan01, soNhiPhan02);
        System.out.printf("==> Tích 2 số nhị phân là : " + soNhiPhan01 + " x " + soNhiPhan02 + " = " + ketQua + "\n");
        System.out.println("Hận thằng ra đề !!!");
    }

    public static void kiemTraSoNhiPhanHopLe(int soNhiPhan) {
        String chuoiNhiPhan = String.valueOf(soNhiPhan);
        if (chuoiNhiPhan.contains("2") || chuoiNhiPhan.contains("3") || chuoiNhiPhan.contains("4") || chuoiNhiPhan.contains("5")
                || chuoiNhiPhan.contains("6") || chuoiNhiPhan.contains("7") || chuoiNhiPhan.contains("8") || chuoiNhiPhan.contains("9")) {
            System.out.println("==> Số nhị phân của bạn không hợp lệ");
            System.exit(1);
        }
    }

    public static int tinhTichHaiSoNhiPhan(int soNhiPhan01, int soNhiPhan02) {
        ArrayList<String> tichThanhPhan = new ArrayList<>();
        String chuoiNhiPhan01 = String.valueOf(soNhiPhan01);
        String chuoiNhiPhan02 = String.valueOf(soNhiPhan02);
        int length01 = chuoiNhiPhan01.length();
        int length02 = chuoiNhiPhan02.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length02; i++) {
            String temp = "";
            int soTrongChuoi02 = Integer.parseInt(String.valueOf(chuoiNhiPhan02.charAt(length02 - (i + 1))));
            for (int j = 0; j < length01; j++) {
                int soTrongChuoi01 = Integer.parseInt(String.valueOf(chuoiNhiPhan01.charAt(length01 - (j + 1))));
                temp = sb.append(soTrongChuoi02 * soTrongChuoi01).append(temp).toString();
            }

            for(int k = 0; k < i; k++) {
                temp = sb.append(temp).append(0).toString();
            }

            for(int k = i; k < length02 - 1; k++) {
                temp = sb.append(0).append(temp).toString();
            }
            tichThanhPhan.add(temp);
        }

        String ketQua = "";
        int soDu = 0;
        for (int j = tichThanhPhan.get(0).length() - 1; j >= 0 ; j--) {
            int result = 0;
            for (String s : tichThanhPhan) {
                result = result + Integer.parseInt(String.valueOf(s.charAt(j))) + soDu;
                if (soDu == 1) {
                    soDu = 0;
                }
                if (result == 2) {
                    result = 0;
                    soDu = 1;
                }
            }
            ketQua = sb.append(result).append(ketQua).toString();
        }
//        System.out.println("===> Kết Quả XSMB : " + ketQua);
        return Integer.parseInt(ketQua);
    }

}