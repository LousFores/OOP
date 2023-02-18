public class VD {
    public static void main(String[] args) {
        int column = 11;
        int row = 6;
        int count = 0;
        for (int i =0; i<(row-1); i++) {
            for (int j = 0; j<column; j++){
                if ((j == (column/2-count)) || (j==(column/2+count))) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            count++;
            System.out.println();
        }
        for (int i = 0; i<column; i++) {
            System.out.print(" * ");
        }
    }
}
