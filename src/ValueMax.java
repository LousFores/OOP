import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ValueMax {
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
        int max = 0;
        int vt = 0;
        for  (int i=0; i<array.length;i++) {
            System.out.print("Số tiền của tỉ phú thứ "+ (i+1) + " : ");
            array[i] = input.nextInt();
            if (array[i] > max) {
                max = array[i];
                vt = i+1;
            }
        }
        System.out.printf("%-20s%s","In ra mảng: ","");
        for (int i=0; i<array.length;i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.printf("\n%-20s%s","Giá trị max là " + max + " và vị trí thứ " + vt,"");
    }
}
