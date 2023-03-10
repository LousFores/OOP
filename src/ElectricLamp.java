public class ElectricLamp {
    public class Eleclamp {
        public boolean status;
        Eleclamp(boolean status) {
            this.status = status;
        }
    }
    public class Button{
        public boolean status;
        public boolean lamp;
        Button(Eleclamp lamp, boolean status) {
            this.lamp = lamp.status;
            this.status = status;
        }

        public boolean buttonOn(){
            return this.status =true;
        }
        public boolean buttonOff(){
            return this.status =false;
        }
        public void buttonClick(){
            if (this.status) {
                if (this.lamp) {
                    System.out.println("Đèn đang sáng");
                } else {
                    System.out.println("Bật đèn đã");
                }
            } else {
                System.out.println("Bật công tắc đi.");
            }
        }
    }
}


