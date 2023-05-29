package JavaProject02;

public class Question5 {

    //Find the First Non-Repeating Character in a String: Given a string,
    //find and return the first non-repeating character. For example, in the
    //string "abracadabra", the first non-repeating character is 'c'.

    public static void NonRepeatingCharacter(String words) {
        for (int i = 0; i < words.length(); i++) {
            char nowChar = words.charAt(i);
            boolean isRepeating = false;

            for (int j = 0; j < words.length(); j++) {
                if (i != j && nowChar == words.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }

            if (!isRepeating) {
                System.out.println("The first non-repeating character is: " + nowChar);
                return;
            }
        }
    }


    public static void main(String[] args) {

        NonRepeatingCharacter("abracadabra");

    }
}
