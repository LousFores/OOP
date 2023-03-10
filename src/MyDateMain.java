import java.util.Scanner;

public class MyDateMain {
        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter the day: ");
//            int day = scanner.nextInt();
//            System.out.print("Enter the month: ");
//            int month = scanner.nextInt();
//            System.out.print("Enter the year: ");
//            int year = scanner.nextInt();
            MyDate date = new MyDate(20,10,2023);
            date.setDay(20);
            date.setMonth(12);
            date.setYear(2022);
            date.Kq();
        }
}

