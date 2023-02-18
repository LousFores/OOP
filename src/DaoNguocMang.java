import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
       int size;
       int[] array;
       Scanner input = new Scanner(System.in);
       System.out.print("Độ rộng mảng: ");
       size = input.nextInt();
       array = new int[size];
       int i=0;
       while (i<array.length) {
           System.out.print("Gía trị phần tử " + i + " : ");
           array[i] = input.nextInt();
           i++;
       }
        System.out.printf("%-20s%s","Phần tử mảng: ","");
        for (int j = 0; j<array.length;j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0;j< array.length/2;j++) {
            int trung_gian = array[j];
            array[j] = array[size - 1- j];
            array[size - 1 - j] = trung_gian;
        }
        System.out.printf("\n%-20s%s","Mảng đảo ngược: ","");
        for (int j = 0; j<array.length;j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
