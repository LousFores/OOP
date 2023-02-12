public class SoNguyenTo {
    public static void main(String[] args) {
        int n = 0;
        int number = 2;
        while (n<20) {
            boolean check = true;
            int i;
            for (i=2; i<=(number/2); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                 System.out.println(number);
                 n++;
            }
            number++;
        }
    }
}
