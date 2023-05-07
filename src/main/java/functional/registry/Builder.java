package functional.registry;

import functional.factory.Factory;

public interface Builder<T> {
    void register(String label, Factory<? extends T> factory);
}
