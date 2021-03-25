package creational.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {

    }

    private static final class Helper {
        public static final BillPughSingleton singleton= new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return Helper.singleton;
    }

}
