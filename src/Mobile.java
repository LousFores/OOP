import javax.swing.*;
public class Mobile {
    public static void main(String[] args) {

    }
    public class Phone {
        public int battery;
        public String typing;
        public String[] inbox;
        public int countInbox;
        public int countLissMess;
        public String[] list_mess;
        public boolean isOn;

        public Phone(){
            inbox =new String[1000];
            list_mess = new String[1000];
            battery = 100;
            isOn = true;
            countInbox = 0;
            countLissMess = 0;
        }
        public boolean isOn() {return this.isOn;}
        public void turnOn() {this.isOn = true;}
        public void turnOff() {this.isOn = false;}
        public void charging() {this.battery = 100;}

        public void typing(String msg) {
            if (this.isOn) {
                this.typing = msg;
                battery--;
            } else {
                System.out.println("Điện thoại hết pin.");
            }
        }
        public void send(Mobile receiver) {
            if(this.isOn) {
                if (countLissMess>1000) {
                    System.out.println("Bộ nhớ đầy.");
                } else {
                    if (!typing.equals("")) {
                        this.list_mess[countLissMess++] = this.typing;
                         this.typing = "";
                        battery--;
                    }
                }
            } else {
                System.out.println("Điện thoại hết pin.");
            }
        }
        public void receive(String msg) {
            if(this.isOn) {
                this.inbox[countInbox++] = msg;
                battery--;
            } else {
                System.out.println("Điện thoại hết pin");
            }
        }
        public void displaySent() {
            System.out.println("====Sent====");
            for (int i = 0; i<this.countLissMess;i++) {
                System.out.println(list_mess[i]);
            }
        }
        public void displayInbox() {
            System.out.println("====Inbox====");
            for (int i=0; i<this.countInbox;i++) {
                System.out.println(inbox[i]);
            }
        }
        public void displayInfo() {
            System.out.println("% Pin: "+this.battery+"%");
            System.out.println("Bat: "+ isOn);
            System.out.println("Bo nho tin nhan den: "+countInbox+"/1000");
            System.out.println("Bo nho tin nhan da gui: "+countLissMess+"/1000");
        }
    }

}
