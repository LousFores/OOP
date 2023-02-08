import java.util.Scanner;

public class ChuyenDoiTien {
    public static void main(String[] args) {
        double tg,usd;
        Scanner pc = new Scanner(System.in);
        System.out.print("Nhập vào tỉ giá VNĐ: ");
        tg = pc.nextDouble();
        Scanner ac = new Scanner(System.in);
        System.out.print("Nhập vào số tiền USD: ");
        usd = ac.nextDouble();
        double quydoi = usd*tg;
        System.out.print("Giá trị VNĐ: " + quydoi);
    }
}
