public class Week4Q2 {
    public static void main(String[] args){
        System.out.println("Part 1 : Square Array");
        make2DArray(6);
    }

    private static int make2DArray(int n){
        int[][] ourArray = new int[n][n];
        //build array
        int count = 1;
        for (int i=0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j+count >= 0){
                    ourArray[i][j] = (j + count);
                }
                else {
                    ourArray[i][j] = 0;
                }

            }
            count--;
        }


        //print array
        for (int z = 0; z < ourArray.length; z++) {
            for (int y = 0; y < ourArray.length; y++) {
                System.out.print(ourArray[z][y] + " ");
            }
            System.out.print("\n");
        }
        return 1;
    }
}
