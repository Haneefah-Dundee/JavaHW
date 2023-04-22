package JavaGroupProject042223;

public class Question10 {
    public static void main(String[] args) {

        /*Write a program to print out duplicate elements from an Array of Strings?*/

        String[] arr = {"Jenna", "Ali", "Marv", "Liam", "Jenna", "Ali", "Jess","Marv"};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j]) && i != j) {
                    System.out.println("Duplicate element: " + arr[i]);
                }
            }
        }

    }
}
