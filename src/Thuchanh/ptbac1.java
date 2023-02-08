package Thuchanh;

import java.util.Scanner;

public class ptbac1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        a = scanner.nextDouble();

        System.out.print("b: ");
        b = scanner.nextDouble();

        System.out.print("c: ");
        c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c-b)/a;
            System.out.println("Đáp án: " + answer);
        } else {
            if (b==c) {
                System.out.println("Vô số nghiệm");
            } else {
                System.out.println("Vô nghiệm");
            }
        }
    }
}
