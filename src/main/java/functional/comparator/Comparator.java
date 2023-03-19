package functional.comparator;

import functional.chaining.Function;

@FunctionalInterface
public interface Comparator<T> {

    int compare(T t1, T t2);

    default <U extends Comparable<U>> Comparator<T> thenComparing(Function<? super T, ? extends U> keyExtractor){
        return (t1, t2) -> {
            int compare = this.compare(t1, t2);
            if (compare == 0) {
                Comparator<T> comparing = comparing(keyExtractor);
                return comparing.compare(t1, t2);
            } else {
                return compare;
            }
        };
    }

    default Comparator<T> thenComparing(Comparator<T> other) {
        return (t1, t2) -> {
            int compare = this.compare(t1, t2);
            if (compare == 0) {
                return other.compare(t1, t2);
            } else {
                return compare;
            }
        };
    }

    static <T, U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> keyExtractor) {
        return (t1, t2) -> {
            U c1 = keyExtractor.apply(t1);
            U c2 = keyExtractor.apply(t2);
            return c1.compareTo(c2);
        };
    }

    static <T, U> Comparator<T> comparing(Function<? super T, ? extends U> keyExtractor, Comparator<U> comparator) {
        return (t1, t2) -> {
            U c1 = keyExtractor.apply(t1);
            U c2 = keyExtractor.apply(t2);
            return comparator.compare(c1, c2);
        };
    }

}
