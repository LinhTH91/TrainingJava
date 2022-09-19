package thlinh1.slide03.exercise04;

/*
Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6
hours.
*/


import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        String choice;
        double salary;
        float hour;
        Scanner inputNumber = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        System.out.println("Tính lương nhân viên dựa trên số giờ làm việc");
        while (true) {
            Employee employee = new Employee();
            System.out.print("Nhập lương của nhân viên : ");
            salary = inputNumber.nextDouble();
            System.out.print("Nhập số giờ làm việc trong ngày của nhân viên : ");
            hour = inputNumber.nextFloat();
            employee.getInfo(salary, hour);
            employee.addSal();
            employee.addWork();
            System.out.println("===> Số lương thực nhận của nhân viên là : " + employee.salary);
            System.out.print("Tiếp tục tính lương (y/n) : ");
            choice = inputString.nextLine();
            if (choice.equals("n")) {
                break;
            }
            System.out.println("================================================================");
        }
    }
}