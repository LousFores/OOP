import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Tạo mảng 1
        System.out.print("Size of Array 1: ");
        int size1 = input.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Element " + i + " : ");
            array1[i] = input.nextInt();
        }

        //Tạo mảng 2
        System.out.print("Size of Array 2: ");
        int size2 = input.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.print("Element " + i + " : ");
            array2[i] = input.nextInt();
        }
        //Tạo và lấy phần tử từ mảng 1 và mảng 2 cho vào mảng 3
        int size3 = size1+size2;
        int[] array3 = new int[size3];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[size1+i] = array2[i];
        }

        //Duyệt mảng 3

        System.out.printf("%-20s%s","New Array 3: ","");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "\t");
        }

    }
}
