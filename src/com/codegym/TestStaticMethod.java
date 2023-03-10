package com.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        StaticMethod s1 = new StaticMethod(11,"Hoe");
        StaticMethod s2 = new StaticMethod(12,"Koe");
        StaticMethod s3 = new StaticMethod(13,"Yoko");
        StaticMethod.change();
        s1.display();
        s2.display();
        s3.display();
    }
}
