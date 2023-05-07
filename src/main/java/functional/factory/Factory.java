package functional.factory;

import java.util.function.Function;
import java.util.function.Supplier;

public interface Factory<T> extends Supplier<T> {

    default T newInstance() {
        return get();
    }

    static <T> Factory<T> createFactory(Supplier<T> supplier) {
        T result = supplier.get();
        return () -> result;
    }

    static <P, T> Factory<T> createFactory(Function<P, T> function, P arg) {
        return () -> function.apply(arg);
    }

}
