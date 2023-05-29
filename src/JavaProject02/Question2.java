package JavaProject02;

public class Question2 {
        //Check if a String is Palindrome: Determine whether a given string is
        //a palindrome, which means it reads the same forwards and
        //backward. For example, "madam" is a palindrome.

        boolean isPalindrome(String str){
            String reversedStr=""; // create a Variable that will hold the reverse String
            for(int i=str.length()-1;i>=0;i--){
                reversedStr=reversedStr+str.charAt(i);

            }
            boolean isStrPalindrome= false;
            if(str.equalsIgnoreCase(reversedStr)){
                isStrPalindrome=true;

            }
            return isStrPalindrome;
        }

        public static void main(String[] args) {

            Question2 obj=new Question2();

            boolean pal=obj.isPalindrome("madam");
            System.out.println(pal);
        }
    }


