public class QuadraticEquationMain {
    public static void main(String[] args) {
        QuadraticEquation quadratic = new QuadraticEquation();
        quadratic.setA(1);
        quadratic.setB(1);
        quadratic.setC(-6);
        System.out.println(quadratic.getDiscriminant());
        quadratic.findX();
    }
}
