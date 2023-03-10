public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public void setA(double a) {this.a = a;}
    public void setB(double b) {this.b = b;}
    public void setC(double c) {this.c = c;}

    public double getA() {return a;}
    public double getB() {return b;}
    public double getC() {return c;}
    public double getDiscriminant() {
        return b*b-4*a*c;
    }
    public void findX() {
        double x1,x2,x;
        double can = Math.pow(getDiscriminant(),0.5);
            x1 = ((-1)*b+can)/(2*a);
            x2 = ((-1)*b-can)/(2*a);
            x = (-1*b)/(2*a);
        if (getDiscriminant()>0) {
            System.out.println("X1. " + x1);
            System.out.println("X2. " + x2);
        } else if (getDiscriminant()==0) {
            System.out.println("X. " + x);
        } else {System.out.println("The equation has no roots");}
    }
}
