package JavaGroupProject042223;

public class Question2 {
    public static void main(String[] args) {
        /*. Create an array of integer values. After the array is created, calculate the sum of all stored
        elements in that array.*/
        int[] values={2,5,3,6,4};
        int sum=0;

        for(int i=0; i< values.length; i++){
            sum+=values[i];
        }
        System.out.println(sum);
    }
}
