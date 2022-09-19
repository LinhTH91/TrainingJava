package thlinh1.slide04.exercise02;

/*
Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with
the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call
the methods 'message' by creating an object for each subclass.
*/


public class Exercise02 {
    public static void main(String[] args) {
        System.out.println("In child classes, call to methods which are inherited from Parent class");
        Daughter daughter = new Daughter();
        daughter.message();
        daughter.messageAbstract();
        System.out.println();
        Son son = new Son();
        son.message();
        son.messageAbstract();
    }
}