package singleton;

public class Main {
    public static void main(String[] args) {
        // demo of the single instantiation
        Thread thread = new Thread(new ThreadLogger());
        thread.start();
        Logger logger = Logger.getLogger();
        System.out.println("Main thread got an instance of " + logger);

        SomeClass someClass = new SomeClass();
        logger.classLogg(thread, "some thread");
        logger.classLogg(someClass, "some class");

    }
}
