package thlinh1.slide04.exercise02;

public class Son extends Parent {

    @Override
    public void message() {
        System.out.println("===> This is Son class with message method");
    }

    @Override
    public void messageAbstract() {
        System.out.println("===> This is Son class with messageAbstract method");
    }
}
