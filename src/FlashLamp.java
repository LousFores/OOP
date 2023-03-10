public class FlashLamp {
    public class Battery {
        public int energy=5;
        void decreaseEnergy() {
            if (this.energy > 0) this.energy--;
        }
        void fullLoadEnergy() {
            this.energy = 5;
        }
    }
    public class Flash {
        public boolean status;
        public boolean turnOn() {
             return status = true;
         }
        public boolean turnOff() {
            return status = false;
        }
        public void light(Battery battery) {
            if (status) {
                if (battery.energy > 0 ) {
                    System.out.println("Đèn pin đang bật");
                    battery.decreaseEnergy();
                } else {
                    System.out.println("Hết pin. Cần nạp lại");
                }
            } else {
                System.out.println("Đèn pin đã tắt");
            }
        }
    }
}
class test {
    public static void main(String[] args) {
        FlashLamp.Battery battery = new FlashLamp().new Battery();
        FlashLamp.Flash flash = new FlashLamp().new Flash();
        flash.turnOn();
        flash.light(battery);
        flash.light(battery);
        flash.light(battery);
        flash.light(battery);
        flash.light(battery);
        flash.light(battery);
        flash.light(battery);
        battery.fullLoadEnergy();
        flash.light(battery);

    }
}
