class RedThread implements Runnable{
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_RED = "\u001B[31m";

    @Override
    public void run() {
        System.out.println(TEXT_RED+"Red"+TEXT_RESET);
    }
}
class BlueThread implements Runnable{
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLUE = "\u001B[34m";

    @Override
    public void run() {
        System.out.println(TEXT_BLUE+"Blue"+TEXT_RESET);
    }
}
class GreenThread implements Runnable{
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_GREEN = "\u001B[32m";

    @Override
    public void run() {
        System.out.println(TEXT_GREEN+"Green"+TEXT_RESET);
    }
}

public class printColoursUsingMultithreading {
    public static void main(String[] args) {
        RedThread red = new RedThread();
        BlueThread blue = new BlueThread();
        GreenThread green = new GreenThread();
        Thread t1 = new Thread(red);
        Thread t2 = new Thread(blue);
        Thread t3 = new Thread(green);
        t1.start();
        t2.start();
        t3.start();
    }
}
