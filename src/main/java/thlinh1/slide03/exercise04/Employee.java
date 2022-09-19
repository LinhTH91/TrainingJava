package thlinh1.slide03.exercise04;

public class Employee {
    public double salary;
    public float hour;

    public Employee() {

    }

    public void getInfo(double salary, float hour) {
        this.salary = salary;
        this.hour =  hour;
    }

    public void addSal() {
        if (salary < 500) {
            this.salary = this.salary + 10;
        }
    }

    public void addWork() {
        if (hour > 6) {
            this.salary = this.salary + 5;
        }
    }
}
