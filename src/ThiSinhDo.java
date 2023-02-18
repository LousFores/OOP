import java.util.Scanner;

public class ThiSinhDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhập vào độ dài mảng SV: ");
            size = input.nextInt();
            if (size > 30) {
                System.out.print("Size vượt quá giới hạn");
            }
        } while (size > 30);
        int[] array = new int[size];
        int count =0;
        for (int i = 0; i < size; i++) {
            System.out.print("Student's" + " test score " + i + ": ");
            array[i] = input.nextInt();
            if ((array[i]>=5) && (array[i]<=10)) count++;
        }
        System.out.println("Số thí sinh không tạch môn: " + count);
    }
}

