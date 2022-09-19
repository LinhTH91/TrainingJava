package thlinh1.slide04.exercise01;

/*
Write a program to print the names of students by creating a Student class. If no name is passed while creating
an object of Student class, then the name should be "Unknown", otherwise the name should be equal to the
String value passed while creating object of Student class.
*/

public class Exercise01 {
    public static void main(String[] args) {
        System.out.println("Hiển thị tên của sinh viên");
        Student student01 = new Student();
        System.out.println("===> Tên của sinh viên không được truyền tham số name : " + student01.name);
        Student student02 = new Student("Ronaldinho");
        System.out.println("===> Tên của sinh viên được truyền tham số name       : " + student02.name);

    }
}