package JavaGroupProject042223;

public class Question6 {
    public static void main(String[] args) {
        /*Write a java program to check whether a given number is prime or not?*/

        int num = 55;
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (i <= 1) {
                isPrime = false;


            } else if (num % i == 0) {
                isPrime = false;

            } else {
                isPrime = true;
            }
        }
        if (isPrime) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }
    }

    }

