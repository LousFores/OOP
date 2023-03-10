public class Animal {
    private String name;
    private String sex;
    private String fur_color;
    private int age;
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFur_color(String fur_color) {
        this.fur_color = fur_color;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void go() {
        System.out.println(name+" is going");
    }
    public String getSex() {
        return sex;
    }
    public String getName() {
        return name;
    }
    public String getFur_color() {
        return fur_color;
    }
    public int getAge() {
        return age;
    }
    public void eat() {
        System.out.println(name+" is eating");
    }
    public void sleep() {
        System.out.println(name+" is sleep");
    }
}
