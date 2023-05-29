package JavaProject02;

public class Question4 {
     public static boolean areAnagrams(String s1, String s2) {

         s1 = s1.replaceAll("\\s", "").toLowerCase();
         s2 = s2.replaceAll("\\s", "").toLowerCase();

    if (s1 == null || s2 == null || s1.length() != s2.length()) {
        return false;
    }

    int[] count = new int[26];

    for (int i = 0; i < s1.length(); i++) {
        count[s1.charAt(i) - 'a']++; // Increment count for characters in s1
        count[s2.charAt(i) - 'a']--; // Decrement count for characters in s2
    }

    for (int i = 0; i < 26; i++) {
        if (count[i] != 0) {
            return false;
        }
    }

    return true;
}

    public static void main(String[] args) {


        System.out.println(areAnagrams("Listen","silent"));
    }

}
