package Thuchanh;

import java.util.Scanner;

public class dateOffMonth {
    public static void main(String[] args) {
        int month;
        String daysInMonth="";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tháng: ");
        month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }
        if (daysInMonth != "")
            System.out.printf("The month %d has %s days!", month, daysInMonth);
        else System.out.print("Invalid input!");
    }
}
