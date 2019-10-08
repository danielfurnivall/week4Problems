import java.util.Arrays;
import java.util.Random;

public class Week4Q1 {
    public static void main(String[] args){
        System.out.println("First use of version control in Java");
        int[] myIntArray = new int[7];
        myIntArray[2] = 4;
        myIntArray[3] = 5;
        System.out.println(myIntArray);
        for(int i=0; i < myIntArray.length; i++) {
            System.out.println(myIntArray[i]);
        }
        arrayMaker();
    }
    private static void arrayMaker(){
        double[] bigArray = new double[10000];
        double count = 0;
        for(int j = 0; j < bigArray.length; j++){
            Random r = new Random();
            double d = r.nextDouble();
            bigArray[j] = d;
            count += bigArray[j];
        }
        System.out.println(Arrays.toString(bigArray));
        System.out.println("Average = " + (count / bigArray.length));
    }
}

