package JavaProject02;

public class Question1 {
    public static void main(String[] args) {
        //Reverse a String: Write a function to reverse a given string. For
        //example, given the input "Hello", the output should be "olleH".

        String givenString = "Hello";
        StringBuilder str = new StringBuilder(givenString);
        str.reverse();

        givenString = str.toString();
        System.out.println(givenString);
    }
}
