public class HinhChuNhat {
    public int height;
    public int weight;
    public long Area(){
        return height*weight;
    }
    public long Perimeter(){
        return (height+weight)*2;
    }
    public void Print(){
        for(int i=0; i<weight;i++){
            if (i==0||i==(weight-1)) {
                for (int j=0; j<height;j++) {System.out.print(" - ");}
            } else {
                for (int j=0; j<height;j++) {
                    if (j==0||j==(height-1)) System.out.print(" - ");
                    else System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
