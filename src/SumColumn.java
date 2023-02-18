import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = new int[5][5];
        for (int row = 0; row <array.length;row++) {
            for (int column = 0; column<array[row].length;column++) {
                array[row][column] = (int) (Math.random()*20);
            }
        }

        System.out.println("Arrays: ");
        for (int row = 0; row <array.length;row++) {
            for (int column = 0; column<array[row].length;column++) {
                System.out.print(array[row][column] + "\t");
            }
            System.out.println();
        }

        System.out.print("Definite column: ");
        int number = input.nextInt();

        long sum = 0;
        for (int row = 0; row <array.length;row++) {
            for (int column = 0; column<array[row].length;column++) {
                if (column == number-1) {
                    sum +=array[row][column];
                }
            }
        }
        System.out.println("Sum of column: " + sum);

    }
}
