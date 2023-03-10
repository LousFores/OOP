public class Test1 {
    public static void main(String[] args) {
       long t1 = System.currentTimeMillis();
       for (int i =0 ; i < 10000; i++){
           System.out.println("ok");
       }
       long t2 = System.currentTimeMillis();
       double t3 = t2-t1;
        System.out.println("Mili giây: " + t1 + "ms");
        System.out.println("Giây: " + t3/1000 + "s");
    }
}
