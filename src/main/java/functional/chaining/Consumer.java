package functional.chaining;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);

    default Consumer<T> andThen(Consumer<? super T> other) {
        return t -> {
            this.accept(t);
            other.accept(t);
        };
    }
}
