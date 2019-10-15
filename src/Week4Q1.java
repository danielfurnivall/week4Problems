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
        System.out.println("Value 16 found at position " + firstposition(intArray, 16));
        System.out.println("Value 16 last position : " + lastposition(intArray, 16));
        System.out.println("Value 16 found : " + intcount(intArray, 16) + " times");
        int[] occurencesArray = arrayOfOccurences(intArray, 16);
        for(int i = 0; i < occurencesArray.length; i++){
            if (occurencesArray[i] != -1){
                System.out.println(occurencesArray[i]);

            }
        }
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

    private static int firstposition(int[] array, int number){
        for(int i = 0; i < array.length; i++){
            //iterate through array
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
        }
    private static int lastposition(int[] array2, int number2) {
        int current = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == number2) {
                System.out.println(i);
                current = i;
            } else {
                continue;
            }

        }
        return current;
    }
    private static int intcount(int[] array3, int number3){
        int count = 0;
        for (int i = 0; i < array3.length; i++){
            if (array3[i] == number3){
                count +=1;
            }
        }
        return count;
    }
    private static int[] arrayOfOccurences(int[] array4, int num){
        int array[] = new int[10000];
        for (int i=0; i<array.length; i++){
            array[i] = -1;
        }
        for (int i = 0; i < array4.length; i++){
            if (array4[i] == num){
                array[i] = i;
            }
        }
        return array;
    }
}

