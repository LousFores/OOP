public class SoNguyenTo2_100 {
    public static void main(String[] args) {
        int number = 2;
        while (number < 100) {
            boolean check = true;
            int i;
            for (i = 2; i <= (number / 2); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check == true) System.out.println(number);
            number++;
        }
    }
}
