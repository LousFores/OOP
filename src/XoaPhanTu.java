import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Size of Array: ");    //Kích thước mảng
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + " : ");   //Phần tử
            array[i] = input.nextInt();
        }
        System.out.print("Index delete: ");                              //Phần tử cần xoá
        int index_del = input.nextInt();
        int c;
        for (int i = c = 0; i < array.length; i++) {
                if (array[i] != index_del) {
                    array[c] = array[i];
                    c++;
                }
            }
        int n=c;
        System.out.printf("%-20s%s","New Array: ","");
        for (int j = 0; j < n; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}