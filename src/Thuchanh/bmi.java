package Thuchanh;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        float width,height;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào cân nặng: ");
        width = scanner.nextFloat();
        System.out.print("Nhập vào chiều cao: ");
        height = scanner.nextFloat();
        float bmi = width/(height*height);

//        if (bmi<18.5) {System.out.println("Underweight");}
//           else if (bmi<25.0) {System.out.println("Normal");}
//            else if (bmi<30.0) {System.out.println("Overweight");}
//             else {System.out.println("Obese");}


        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
