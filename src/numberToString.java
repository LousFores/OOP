import java.util.Scanner;

public class numberToString {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số: ");
        number = scanner.nextInt();
        int st1 = (number - number%100)/100;
        int st2 = (number%100-number%10)/10;
        int st3 = number%10;
        String Str ="";
        switch (st1) {
            case 1: Str = "One hundred";break;
            case 2: Str = "Two hundred";break;
            case 3: Str = "Three hundred";break;
            case 4: Str = "Four hundred";break;
            case 5: Str = "Five hundred";break;
            case 6: Str = "Six hundred";break;
            case 7: Str = "Seven hundred";break;
            case 8: Str = "Eight hundred";break;
            case 9: Str = "Nine hundred";break;
        }
        Str = Str + " and";
        switch (st2) {
            case 1: Str = Str +" Ten";break;
            case 2: Str = Str +" Twenty";break;
            case 3: Str = Str +" Thirty";break;
            case 4: Str = Str +" Fourty";break;
            case 5: Str = Str +" Fifty";break;
            case 6: Str = Str +" Sixty";break;
            case 7: Str = Str +" Seventy";break;
            case 8: Str = Str +" Eighty";break;
            case 9: Str = Str +" Ninety";break;
        }
        switch (st3) {
            case 1: Str = Str +" Ten";break;
            case 2: Str = Str +" Two";break;
            case 3: Str = Str +" Three";break;
            case 4: Str = Str +" Four";break;
            case 5: Str = Str +" Five";break;
            case 6: Str = Str +" Six";break;
            case 7: Str = Str +" Seven";break;
            case 8: Str = Str +" Eight";break;
            case 9: Str = Str +" Nine";break;
        }

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        System.out.print(Str);
    }
}
