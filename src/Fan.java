public class Fan {
    private final int slow=1;
    private final int medium=2;
    private final int fast=3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public int getSlow() {return slow;}
    public int getMedium() {return medium;}
    public int getFast() {return fast;}
    public boolean getTurnOn() {return true;}
    public boolean getTurnOff() {return false;}


    public void setSpeed(int speed) {this.speed = speed;}
    public void setOn(boolean on) {this.on = on;}
    public void setRadius(double radius) {this.radius = radius;}
    public void setColor(String color) {this.color = color;}

    public int getSpeed() {return speed;}
    public boolean isOn() {return on;}
    public double getRadius() {return radius;}
    public String getColor() {return color;}

    public Fan() {
       speed = getSlow();
       on = getTurnOff();
       radius = 5;
       color = "blue";
    }
    public void toSt() {
        if (isOn()) {
            System.out.println("   Fan is on");
            System.out.println("   Sleed. " + getSpeed());
            System.out.println("   Color. " + getColor());
            System.out.println("   Radius. " +getRadius());

        } else {
            System.out.println("   Fan is off");
            System.out.println("   Color. " + getColor() );
            System.out.println("   Radius. "+ getRadius());
        }
    }
}
