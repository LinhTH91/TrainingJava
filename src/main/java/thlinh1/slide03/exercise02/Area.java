package thlinh1.slide03.exercise02;

public class Area {
    public float length;
    public float breadth;

    public Area(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public float returnArea() {
        return this.length * this.breadth;
    }
}
