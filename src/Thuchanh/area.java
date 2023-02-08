package Thuchanh;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        float width,height;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chiều rộng: ");
        width = scanner.nextFloat();
        System.out.print("Nhập vào chiều dài: ");
        height = scanner.nextFloat();

        float area = width*height;
        System.out.println("Area: " + area);
    }
}
