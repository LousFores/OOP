public class TemperatureMain {
    public static void main(String[] args) {
        Temperature doC = new Temperature();
        doC.setC(20);
        System.out.println("Độ C. " + doC.getC());
        System.out.println("Độ C sang độ F. " + doC.getF());
        System.out.println("Độ C sang độ Kenvin. " + doC.getKenvin());
    }
}
