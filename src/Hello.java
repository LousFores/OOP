import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = pc.nextLine();
        System.out.println("Hello:" + name);
    }
}
