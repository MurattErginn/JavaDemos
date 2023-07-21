package StopwatchThread;

public class StopwatchThread implements Runnable {

    private Thread t;
    private String threadName;

    public StopwatchThread(String threadName) {
        this.threadName = threadName;
        System.out.println(threadName + " is created.");
    }

    @Override
    public void run() {
        System.out.println(threadName + " is working.");
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + ": " + i);
                Thread.sleep(1000); // 1000 ms = 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " is interrupted.");
        }

        System.out.println(threadName + " is over.");
    }

    public void start() {
        System.out.println(threadName + "object is created.");
        if(t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
