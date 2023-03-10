package com.codegym;

public class AccessModifier {
    public class Cricle {
        private final double PI=3.14;
        private double radius;
        private double Area;
        private double Perimeter;
        private String color;
        Cricle(){
              this.radius = radius;
              this.color = color;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }
        public double getPerimeter(){
            return Perimeter=this.radius*2*PI;
        }
        public double getArea() {
             return Area=radius*radius*PI;
        }
    }
}
class TestCricle {
    public static void main(String[] args) {
        AccessModifier.Cricle cricle = new AccessModifier(). new Cricle();
        cricle.setRadius(10);
        System.out.println("Chu vi hình tròn: "+cricle.getPerimeter());
        System.out.println("Diện tích hình tròn: "+cricle.getArea());
    }
}
