package hoangtran.Day4;

import java.util.Scanner;

public class Area {

    public Area(int length,int breadth) {

    }
    public int returnArea(int a,int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài : ");
        int length = sc.nextInt();
        System.out.println("Nhập vào chiều rộng : ");
        int breadth = sc.nextInt();
        Area a1 = new Area(length,breadth);
        System.out.println("Diện tích hình chữ nhật a1 là : ");
        System.out.println(a1.returnArea(length,breadth));

        System.out.println("Nhập vào chiều dài : ");
        int x = sc.nextInt();
        System.out.println("Nhập vào chiều rộng : ");
        int y = sc.nextInt();
        Area a2 = new Area(x,y);
        System.out.println("Diện tích hình chữ nhật a2 là : ");
        System.out.println(a2.returnArea(x,y));

    }
}
