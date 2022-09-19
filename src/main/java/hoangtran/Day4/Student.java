package hoangtran.Day4;

public class Student {
    String name;
    int roll_no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public static void main(String[] args) {
        Student student1 = new Student("John",2);
        System.out.println("Student 1 Name : "+student1.name + " and Roll No : " +student1.roll_no);
    }
}
