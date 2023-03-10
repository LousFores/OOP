import java.util.Scanner;

public class StopWatchMain {
    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();
        stopwatch.setStartTime(System.currentTimeMillis());
        int count=0;
        for (int i =0 ; i < 10000; i++){
            System.out.println("ok");
        }
        stopwatch.setEndTime(System.currentTimeMillis());
        System.out.println("Milisecond. "+ stopwatch.getEndTime()+ " ms");
        System.out.println("Second. "+stopwatch.getElapsedTime()/1000 + "s");
    }
}
