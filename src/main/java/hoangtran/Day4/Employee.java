package hoangtran.Day4;

public class Employee {
    String name;
    int yearOfJoining;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Robert",1994,"64C-WallsStresat");
        System.out.println(emp1.getName() + " " + emp1.getYearOfJoining() + " " + emp1.address);

        Employee emp2 = new Employee("Sam",2000,"68D-WallsStresat");
        System.out.println(emp2.getName() + " " + emp2.getYearOfJoining() + " " + emp2.address);

        Employee emp3 = new Employee("John",1999,"26B-WallsStresat");
        System.out.println(emp3.getName() + " " + emp3.getYearOfJoining() + " " + emp3.address);
    }
}
