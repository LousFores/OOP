import java.util.Scanner;

public class MaxValue2Array {
    public static void main(String[] args) {
         int[][] array = new int[5][5];
         int max =0;
         Scanner input = new Scanner(System.in);
         for (int i = 0; i<5; i++) {
             for (int j = 0; j<array[i].length; j++) {
                 System.out.print("Array" + "["+ i + "]"+ "["+ j +"]: ");
                 array[i][j] = input.nextInt();
             }
         }
         for (int i = 0; i<5; i++) {
             for (int j = 0; j<array[i].length; j++) {
                 if (array[i][j] > max) {
                       max = array[i][j];
                 }
             }
         }
         System.out.print("Max value of Arrays: " + max);
    }
}
