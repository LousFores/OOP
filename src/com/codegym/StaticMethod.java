public class StaticMethod {
    public class Student{
        private int id;
        private String name;
        private static String college="12345";
        Student(int id, String name){
            this.id = id;
            this.name = name;
        }
        static void change() {
            college = "CODEGYM";
        }
    }
}
