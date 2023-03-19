package functional.chaining;

@FunctionalInterface
public interface Function<T,R> {

    R apply(T t);

    default <V> Function<T, V> andThen(Function<? super R, ? extends V> next) {
        return t -> {
            R apply = this.apply(t);
            return next.apply(apply);
        };
    }

    default <V> Function<V, R> composing(Function<? super V, ? extends T> first) {
        return v -> {
            T apply = first.apply(v);
            return this.apply(apply);
        };
    }

}
