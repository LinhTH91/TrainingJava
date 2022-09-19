package thlinh1.slide04.exercise03;

/*
Write a class that implements the CharSequence interface found in the java.lang package. Your
implementation should return the string backwards. Select one of the sentences from this book to use as the
data. Write a small main method to test your class; make sure to call all four methods.
*/


public class Exercise03 {
    public static void main(String[] args) {
        System.out.println("Triển khai methods kế thừa từ interface CharSequence");
        CharSequenceImpl charSequenceImpl = new CharSequenceImpl("Write a class that implements the CharSequence interface found in the java.lang package");
//        charSequenceImpl.value = "Write a class that implements the CharSequence interface found in the java.lang package";
        System.out.println("===> Method length       : " + charSequenceImpl.length());
        System.out.println("===> Method charAt       : " + charSequenceImpl.charAt(0));
        System.out.println("===> Method toString     : " + charSequenceImpl.toString());
        System.out.println("===> Method subSequence  : " + charSequenceImpl.subSequence(0, 5));

    }
}