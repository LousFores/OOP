public class CatAndMouse {
    public class Mouse {
        public String name_mouse;
        public int mass_mouse;
        public int speed_mouse;
        public boolean status_mouse;

        public Mouse(String n, int mass, int speed) {
            this.name_mouse = n;
            this.mass_mouse = mass;
            this.speed_mouse = speed;
        }

        public boolean Die() {
            return this.status_mouse = false;
        }

        public boolean noDie() {
            return this.status_mouse = true;
        }

        public void Status_mouse() {
            if (!this.status_mouse) {
                System.out.println("Con chuột còn sống.");
            } else {
                System.out.println("Con chuột đã chết.");
            }
        }

        public void soud_mouse() {
            System.out.println("Chit Chit");
        }
    }

    public class Cat {
        public String name_cat;
        public int mass_cat;
        public int speed_cat;

        public Cat(String name_cat, int mass_cat, int speed_cat) {
            this.name_cat = name_cat;
            this.mass_cat = mass_cat;
            this.speed_cat = speed_cat;
        }

        public void cat_catch_mouse(Mouse mouse) {
            if (this.speed_cat > mouse.speed_mouse) {
                System.out.println("Mèo bắt được chuột");
            } else {
                System.out.println("Mèo không bắt được chuột");
            }
        }

        public void eat_the_mouse(Mouse mouse) {
            if (mouse.status_mouse) {
                this.mass_cat = this.mass_cat + mouse.mass_mouse;
                mouse.status_mouse = false;
                System.out.println("Chuột đã bị mèo ăn");
                System.out.println("Khối lượng của mèo: "+this.mass_cat);
            } else {
                System.out.println("Chuột đã chết trước đó.");
            }
        }
        public void soud_cat() {
            System.out.println("Meo Meo");
        }
    }
}

class TestProgram {
    public static void main(String[] args) {
        CatAndMouse.Cat tom =  new CatAndMouse().new Cat("Tom", 3, 3);
        CatAndMouse.Mouse jerry = new CatAndMouse().new Mouse("Jerry",5,2);
        tom.soud_cat();
        jerry.soud_mouse();
        tom.cat_catch_mouse(jerry);
        jerry.noDie();
        tom.eat_the_mouse(jerry);
    }
}
