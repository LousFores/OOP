import java.util.Scanner;

public class MinValueArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập vào độ rộng mảng: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Mời nhập lại số không lớn hơn 20!");
            }
        } while(size > 20);
        array = new int[size];
        for  (int i=0; i<array.length;i++) {
            System.out.print("Element "+ i + ": ");
            array[i] = input.nextInt();
        }

        int min = array[0];
        int vt = 0;
        for (int i=1; i<array.length;i++) {
            if (array[i] < min) {
                min = array[i];
                vt = i;
            }
        }
        System.out.printf("\n%-20s%s","Giá trị max là " + min + " ở vị trí thứ " + vt,"");
    }
}
