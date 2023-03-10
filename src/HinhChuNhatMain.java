import java.util.Scanner;

public class HinhChuNhatMain {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.weight = 5;
        hcn.height = 7;
        System.out.println("Perimeter: " + hcn.Perimeter());
        System.out.println("Area: "+hcn.Area());
        hcn.Print();
    }
}
