package com.codegym;

public class StaticMethod {
        private int id;
        private String name;
        private static String college="12345";
        public StaticMethod(int id, String name){
            this.id = id;
            this.name = name;
        }
         static void change() {
            college = "CODEGYM";
        }
        void display(){
            System.out.println(this.id + " "+this.name + " "+ college);
        }
}
