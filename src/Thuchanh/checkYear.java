package Thuchanh;

import java.util.Scanner;

public class checkYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào năm: ");
        int year;
        boolean check = false;
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    check = true;
                }
            } else {
                check = true;
            }
        }
        if(check){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
        System.out.printf("%s\n%s", "Tôi yêu lập trình.", "Thích Java và uống cafe.");
    }
}