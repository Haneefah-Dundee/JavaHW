package JavaGroupProject042223;

public class Question1 {
    public static void main(String[] args) {
        /* Create a program that uses an array to store a list of temperatures for a week, and then uses a loop
         to find the highest and lowest temperature for the week.*/

        double[] tempList= {15.3, 19.8,24.4,25.6,26.3,24.8,20.1};
        double highestTemp=tempList[0];
        double lowestTemp=tempList[0];

        for(int i=1; i<tempList.length; i++){
            if(tempList[i]> highestTemp){
                highestTemp =tempList[i];
            }
            if (tempList[i]<lowestTemp){
                lowestTemp=tempList[i];
            }
        }
        System.out.println("Highest: "+highestTemp);
        System.out.println("lowest: "+ lowestTemp);
    }
}
