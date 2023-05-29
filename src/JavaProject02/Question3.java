package JavaProject02;

public class Question3 {
    //Count the Number of Words in a String: Write a function to count the
    //number of words in a given string. Words are separated by spaces or
    //punctuation. For example, the str "Hello, world!" should return 2.
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        String[] words = str.split("\\s+"); // Split the string by whitespace

        return words.length; // Return the count of words
    }

    public static void main(String[] args) {
        System.out.println(countWords("Hello, world I am Haneefah Dundee!"));
    }
}
