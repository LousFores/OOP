import java.util.Scanner;

public class SearchChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String str = input.nextLine();
        System.out.print("Nhập vào kí tự: ");
        char ki_tu = input.next().charAt(0);   //Cách nhập giá trị kiểu kí tự bất kì từ bàn phím
        int count = 0;
        char st;
        for (int i = 0; i<str.length(); i++) {
            if (ki_tu==str.charAt(i)) {count++;}    //str.charAt(i) trả về kí tự ở vị trí thứ i trong chuỗi str
        }
        System.out.print("Số lần xuất hiện của kí tự " + ki_tu + " là: " + count);
        System.out.println(1%2);
    }
}
