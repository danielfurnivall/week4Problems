import java.util.Arrays;
import java.util.Random;

public class Week4Q1 {
    public static void main(String[] args){

        doubleArrayMaker();
        intArrayMaker();
    }
    private static void doubleArrayMaker(){
        double[] bigArray = new double[10000];
        double count = 0;
        for(int j = 0; j < bigArray.length; j++){
            Random r = new Random();
            double d = r.nextDouble();
            bigArray[j] = d;
        }
        //System.out.println(Arrays.toString(bigArray)); prints entire array
        System.out.println("Array 1 Length = "+ bigArray.length);
        System.out.println("Array 1 Average = " + average(bigArray));

    }
    private static void intArrayMaker(){
        int[] intArray = new int[10000];
        for (int i = 0; i < intArray.length; i++){
            Random r = new Random();
            int d = r.nextInt(30);
            intArray[i] = d;
        }
        System.out.println("Array 2 Length = " + intArray.length);
        System.out.println("Array 2 Average = "+ intaverage(intArray));
        System.out.println("Value 16 found at position " + position(intArray, 16));
    }
    private static double average(double[] array){
        double counter = 0;
        for (int j = 0; j < array.length; j++) {
            counter += array[j];
        }
        return (counter / array.length);
    }
    private static double intaverage(int[] array){
        double counter = 0;
        for (int j = 0; j < array.length; j++) {
            counter += array[j];
        }
        return (counter / array.length);
    }

    private static int position(int[] array, int number){
        for(int i = 0; i < array.length; i++){
            //iterate through array
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
        }

}

