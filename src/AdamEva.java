public class AdamEva {
    public class Apple {
        public int weight = 10;
        Apple(int weight) {
            this.weight = weight;
        }
        public int decrease(){
            return this.weight=this.weight--;
        }
    }
    public class Human {
        public String name;
        public boolean gender;
        public int weight;

        Human(String name, boolean gender, int weight) {
            this.name = name;
            this.gender = gender;
            this.weight = weight;
        }

        public boolean isMale() {
            if (this.gender) return true;
            else return false;
        }
        public boolean checkApple(Apple chile) {
            if (chile.weight > 0) return true;
            else return false;
        }
        public void eat(Apple chile) {
            if (chile.weight > 0) {
                this.weight = this.weight + 1;
                chile.weight--;
                System.out.println("Weight "+ this.name + ". " + this.weight);
                System.out.println(chile.decrease());
            } else {
                System.out.println("Snake: Lấy quả khác mà ăn.");
            }
        }

        public void say(String Adam) {
            System.out.println("Adam" + "Ôi đàn bà!");
        }
    }
}
class text {
    public static void main(String[] args) {
        AdamEva.Apple apple = new AdamEva().new Apple(5);
        AdamEva.Human Eva = new AdamEva().new Human("Eva",true,40);
        System.out.println(apple.weight);
        Eva.eat(apple);
        Eva.eat(apple);
        Eva.eat(apple);
        Eva.eat(apple);
        Eva.eat(apple);
        Eva.eat(apple);
        Eva.eat(apple);
        Eva.eat(apple);
        Eva.eat(apple);
        Eva.eat(apple);
        Eva.eat(apple);
        Eva.eat(apple);
        Eva.eat(apple);
        Eva.eat(apple);

    }
}
