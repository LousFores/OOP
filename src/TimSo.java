import java.util.Scanner;

public class TimSo {
    public static void main(String[] args) {
        String[] Fruits = {"Táo","Ngô","Xoài","Khoai","Sắn","Lúa","Nếp","Cải",};
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tên trái cây: ");
        String name_Fruits = input.nextLine();
        boolean check = false;
        for (int i = 0; i < Fruits.length; i++) {
            if (Fruits[i].equals(name_Fruits)) {
                System.out.println("Vị trí " + name_Fruits+ " trong mảng Fruits: " + i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm được " + name_Fruits + " trong mảng Fruits");
        }
    }
}
