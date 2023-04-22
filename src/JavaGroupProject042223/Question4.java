package JavaGroupProject042223;

public class Question4 {
    public static void main(String[] args) {
        /*Create a 2D array of integers. Develop a program which will calculate the sum of even and odd numbers
         for that array.*/
        int[][] arrays = {{4,6,8},{3,5,9}};

        int evenSum=0;
        int oddSum=0;

        for (int i =0; i< arrays.length; i++){
            for(int j=0; j<arrays[i].length;j++){
                if (arrays[i][j]%2==0){
                    evenSum+=arrays[i][j];
                }
                else {oddSum+=arrays[i][j];
                }
            }
        }
        System.out.println("Sum of even: "+evenSum);
        System.out.println("Sum of odd: "+oddSum);

    }
}
