package Utility;

public class MyFunc {
    public static void Wait(int second) {
        try {
            Thread.sleep(1000L * second);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

