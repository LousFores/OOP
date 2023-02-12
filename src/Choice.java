import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.Hình vuông.");
            System.out.println("2.Hình tam giác.");
            System.out.println("3.Hình chữ nhật.");
            System.out.println("0.Exit.");
            System.out.print("My choice is: ");
            choice = input.nextInt();
            int pc1;
            switch (choice) {
                case 1:
                    for (int i = 0;i<6; i++) {
                        for (int j = 0;j<6; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1;i<=6; i++) {
                        for (int j = 0;j<i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0;i<3;i++) {
                        for (int j = 0;j<6; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
