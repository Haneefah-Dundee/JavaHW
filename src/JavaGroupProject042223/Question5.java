package JavaGroupProject042223;

public class Question5 {
    public static void main(String[] args) {

        /*Write a program to swap 2 numbers without a temporary variable*/

        int num1=7;
        int num2=11;

        System.out.println("Before swap: num1 = "+num1 +", num2= "+num2);


        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("After swap: num1 = "+num1 +", num2= "+num2);
    }
}
