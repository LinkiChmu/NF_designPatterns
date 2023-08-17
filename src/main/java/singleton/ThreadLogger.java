package singleton;

public class ThreadLogger implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread got an instance of " + Logger.getLogger());
    }
}
