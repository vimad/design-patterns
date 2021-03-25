package creational.singleton;

public class SynchronizedSingleton {
    private static SynchronizedSingleton singleton;

    private SynchronizedSingleton() {

    }

    public static synchronized SynchronizedSingleton getInstance() {
        if (singleton == null) {
            singleton = new SynchronizedSingleton();
        }
        return singleton;
    }
}
