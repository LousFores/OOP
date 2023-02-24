 import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Choice = 1, Celsius to Fahrenheit");
        System.out.println("Choice = 2, Fahrenheit to Celsius");
        System.out.println("Choice = 0, Exit program");
        do {
            System.out.print("Your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Celsius: ");
                    double Celsius = input.nextDouble();
                    System.out.println("Output Fahrenheit: " + toFahrenheit(Celsius));
                    break;
                case 2:
                    System.out.print("Enter Farenheit: ");
                    double Fahrenheit = input.nextDouble();
                    System.out.println("Output Fahrenheit: " + toCelsius(Fahrenheit));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double toFahrenheit(double value) {
        double Fahrenheit = (9.0/5)*value +32;
        return Fahrenheit;
    }
    public static double toCelsius(double value) {
        double Celsius = (value-32)*(5.0/9);
        return Celsius;
    }
}
