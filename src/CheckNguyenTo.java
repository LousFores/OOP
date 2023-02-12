import java.util.Scanner;

public class CheckNguyenTo {
    public static void main(String[] args) {
            int number;
            Scanner pc = new Scanner(System.in);
            System.out.print("Nhập vào 1 số: ");
            number = pc.nextInt();
            boolean check = true;
            if (number < 2){ System.out.println("Đây không phải số nguyên tố");}
            else {
                int i;
                for (i = 2; i <= (number / 2); i++) {
                    if (number % i == 0) {
                        check = false;
                        break;
                    }
                }
                if (check == true) System.out.println("Đây là số nguyên tố");
                else System.out.println("Đây không phải số nguyên tố");
            }
    }
}
