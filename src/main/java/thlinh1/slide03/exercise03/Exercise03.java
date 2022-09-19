package thlinh1.slide03.exercise03;

/*
Write a program that would print the information (name, year of joining, salary, address) of three employees
by creating a class named 'Employee'. The output should be as follows:
Name 		Year of joining 		Address
Robert 		1994 			64C- WallsStreat
Sam 		2000 			68D- WallsStreat
John 		1999 			26B- WallsStreat
*/

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        int maxLengthName = "Name".length() + 3, maxLengthYear = "Year of joining".length() + 3,
                maxLengthSalary = "Salary".length() + 3, maxLengthAddress = "Address".length() + 3;
        Scanner inputNumber = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        System.out.println("Hiển thị thông tin nhân viên");
        System.out.print("Nhập số nhân viên : ");
        int num = inputNumber.nextInt();
        Employee[] employees = new Employee[num];
        for (int i = 0; i < num; i++) {
            employees[i] = new Employee();
            System.out.print("Nhập tên nhân viên " + (i + 1) + "          : ");
            employees[i].name = inputString.nextLine();
            maxLengthName = findMaxLength(maxLengthName, employees[i].name.length());

            System.out.print("Nhập năm tham gia nhân viên " + (i + 1) + " : ");
            employees[i].yearOfJoining = inputNumber.nextInt();
            if (employees[i].yearOfJoining > 9999) {
                System.out.println("===> Số năm không đúng");
                System.exit(1);
            }
            maxLengthYear = findMaxLength(maxLengthYear, String.valueOf(employees[i].yearOfJoining).length());

            System.out.print("Nhập lương nhân viên " + (i + 1) + "        : ");
            employees[i].salary = inputNumber.nextDouble();
            maxLengthSalary = findMaxLength(maxLengthSalary, String.valueOf(employees[i].salary).length());

            System.out.print("Nhập địa chỉ nhân viên " + (i + 1) + "      : ");
            employees[i].address = inputString.nextLine();
            maxLengthAddress = findMaxLength(maxLengthAddress, employees[i].address.length());

            System.out.print("\n--------------------------------------------\n");
        }

        int maxLengthRecord = maxLengthName + maxLengthYear + maxLengthSalary + maxLengthAddress + 16;

        for (int i = 0; i < maxLengthRecord + 1; i++) {
            System.out.print("=");
        }
        System.out.println();
        for (int i = 0; i < maxLengthRecord/2 - 10; i++) {
            System.out.print(" ");
        }
        System.out.print("WELCOME TO CMC GLOBAL");
        System.out.println();
        for (int i = 0; i < maxLengthRecord + 1; i++) {
            System.out.print("=");
        }
        System.out.println();

        //hien thi column name
        displayCellTable(maxLengthName, "Name");
        displayCellTable(maxLengthYear, "Year of joining");
        displayCellTable(maxLengthSalary, "Salary");
        displayCellTable(maxLengthAddress, "Address");
        System.out.println();
        for (int i = 0; i < maxLengthRecord + 1; i++) {
            System.out.print("-");
        }
        System.out.println();

        //hien thi record
        for (int i = 0; i < num; i++) {
            displayCellTable(maxLengthName, employees[i].name);
            displayCellTable(maxLengthYear, String.valueOf(employees[i].yearOfJoining));
            displayCellTable(maxLengthSalary, String.valueOf(employees[i].salary));
            displayCellTable(maxLengthAddress, employees[i].address);
            System.out.print("|");
            System.out.println();
            for (int j = 0; j < maxLengthRecord + 1; j++) {
                System.out.print("-");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void displayCellTable(int length, String column) {
        String title = "| " + column;
        System.out.print(title);
        for (int i = 0; i < length - title.length() + 2; i++) {
            System.out.print(" ");
        }
        System.out.print("  ");
        if (column.equals("Address")) {
            System.out.print("|");
        }
    }

    public static int findMaxLength(int currentLength, int inputLength) {
        return Math.max(currentLength, inputLength);
    }

}