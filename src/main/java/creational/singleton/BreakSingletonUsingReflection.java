package creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletonUsingReflection {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        BillPughSingleton singleton = BillPughSingleton.getInstance();
        BillPughSingleton singleton2 = BillPughSingleton.getInstance();

        Constructor<BillPughSingleton> declaredConstructor = BillPughSingleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        BillPughSingleton singleton3 = declaredConstructor.newInstance();

        System.out.println(singleton == singleton2);
        System.out.println(singleton == singleton3);
    }
}
