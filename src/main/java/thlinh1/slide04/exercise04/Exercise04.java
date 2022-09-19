package thlinh1.slide04.exercise04;

/*
A class called Author is designed as shown in the class diagram. It contains:

Three private member variables: name (String), email (String), and gender (char of either 'm' or 'f' - you might
also use a boolean variable called isMale having value of true or false).
A constructor to initialize the name, email and gender with the given values.
(There is no default constructor, as there is no default value for name, email and gender.)
Public getters/setters: getName(), getEmail(), setEmail(), and getGender().
(There are no setters for name and gender, as these properties are not designed to be changed.)
A toString() method that returns "name (gender) at email", e.g., "Tan Ah Teck (m) at
ahTeck@somewhere.com".

*/


public class Exercise04 {
    public static void main(String[] args) {
        System.out.println("Tạo 1 class khởi tạo 1 đối tượng và gọi đến method toString()");
        Author author = new Author("Trần Hải Linh", "thlinh1@cmcglobal.vn", 'm');
        System.out.println("===> toString() : " + author);
    }
}