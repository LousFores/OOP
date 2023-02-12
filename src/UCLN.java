import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int a,b;
        Scanner pc = new Scanner(System.in);
        System.out.print("Nhập vào số a: ");
        a = pc.nextInt();
        System.out.print("Nhập vào số b: ");
        b = pc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0||b==0) {
            System.out.print("Không thể thực hiện phép tính!");
        } else {
            while (a != b) {
                if (a > b) a = a - b;
                else b = b - a;
            }
            System.out.print("UCLN: " + a);
        }
    }
}
