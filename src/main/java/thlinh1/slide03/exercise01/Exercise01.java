package thlinh1.slide03.exercise01;

/*
Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of
roll_no as '2' and that of name as "John" by creating an object of the class Student.

*/

public class Exercise01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        System.out.println("Tạo đối tượng thuộc lớp Student");
        System.out.println("===> RollNo của student 01 : " + student01.rollNo);
        System.out.println("===> RollNo của student 01 : " + student01.name);
        System.out.println();
        Student student02 = new Student(123, "Automation");
        System.out.println("===> RollNo của student 02 : " + student02.rollNo);
        System.out.println("===> RollNo của student 02 : " + student02.name);
    }
}