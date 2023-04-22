package JavaGroupProject042223;

public class Question9 {
    public static void main(String[] args) {
     /*Write a java program to find the second-largest number in the array?*/


        int[] arr = {8, 23, 91, 11, 7, 12, 5, 14, 15};


        int max = arr[0];
        int max2 = arr[0];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];
            }
        }

        System.out.println("Second largest number in the array: " + max2);
    }

    }

