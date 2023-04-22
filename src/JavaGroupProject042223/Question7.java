package JavaGroupProject042223;

public class Question7 {
    public static void main(String[] args) {
        /*Write a Java Program to print the first 10 numbers of Fibonacci series.*/


        int fibNum = 10;
        int Num1 = 0, Num2 = 1;


        for (int i = 1; i <= fibNum; ++i) {
            System.out.print(Num1 + " ");

            int sum =Num1 + Num2;
           Num1 = Num2;
           Num2 = sum;


    }}
}
