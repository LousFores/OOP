public class FanMain {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.getFast());
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(fan1.getTurnOn());

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getMedium());
        fan2.setRadius(5);

        System.out.println("Fan 1. ");
        fan1.toSt();
        System.out.println("Fan 2. ");
        fan2.toSt();
    }
}
