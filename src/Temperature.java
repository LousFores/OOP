public class Temperature {
    private int C;
    public void setC(int C) {this.C = C;}
    public int getC() {
        return C;
    }
    public double getF(){
        return (C*1.8)+32;
    }
    public double getKenvin(){
        return C+273.15;
    }
}
