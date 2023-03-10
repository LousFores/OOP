public class Test2 {
    public static void main(String[] args) {
        Animal Cat = new Animal();
        Cat.setName("Tom");
        Cat.setSex("Male");
        Cat.setFur_color("Blue");
        Cat.setAge(5);
        System.out.println(Cat.getName());
        Cat.go();
        Cat.eat();
        Cat.sleep();
    }
}
