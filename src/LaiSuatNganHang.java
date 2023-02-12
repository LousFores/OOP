import java.util.Scanner;

public class LaiSuatNganHang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào tiền gửi: ");
        double tien_gui = input.nextDouble();
        System.out.println("Nhập vào số tháng gửi: ");
        int month = input.nextInt();
        System.out.println("Nhập vào lãi suất ngân hàng: ");
        double lai_suat = input.nextDouble();
        double so_tien_lai = 0;
        for (int i=0; i<month; i++) {
            so_tien_lai +=tien_gui*((lai_suat/100)/12)*month;
        }
        System.out.println("Số tiền lãi sau "+ month + " tháng: " + so_tien_lai);
    }
}
