package functional.registry;

import functional.chaining.Consumer;
import functional.factory.Factory;

import java.util.HashMap;
import java.util.Map;

public interface Registry<T> {

    public Factory<? extends T> buildFactory(String label);

    public static <T> Registry<T> createRegistry(Consumer<Builder<T>> builderConsumer) {
        Map<String, Factory<? extends T>> map = new HashMap<>();
        builderConsumer.accept(map::put);
        return label -> map.getOrDefault(label, () -> { throw new RuntimeException("Not found in registry"); });
    }
}
