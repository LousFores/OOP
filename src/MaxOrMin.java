import java.util.Scanner;

public class MaxOrMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int choice;
        System.out.println("Choice = 1, Start program.");
        System.out.println("Choice = 0, Exit program.");
        do {
            System.out.print("Your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                for (int i=0; i<array.length; i++) {
                    array[i] = (int) (Math.random()*100);
                }
                System.out.print("Show array: ");
                for (int i=0; i<array.length; i++) {
                    System.out.print(array[i]+" ");
                }
                System.out.println();
                System.out.println("Max Value = " + maxValue(array));
                System.out.println("Min Value = " + minValue(array));
            } else {
                System.exit(0);
            }

        } while (choice != 0 );
    }
    public static int maxValue(int[] arr) {
        int max=arr[0];
        for (int i=0; i<arr.length; i++) {
           if (arr[i]>max) max = arr[i];
        }
        return max;
    }
    public static int minValue(int[] arr) {
        int min=arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i]<min) min = arr[i];
        }
        return min;
    }

}
