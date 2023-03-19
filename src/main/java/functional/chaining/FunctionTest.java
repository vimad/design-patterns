package functional.chaining;

public class FunctionTest {

    public static void main(String[] args) {
        Function<String, Integer> toInt = Integer::parseInt;
        Function<Integer, Long> square = i -> (long) i * i;

        Function<String, Long> squareStr = toInt.andThen(square);
        squareStr.apply("2");

        Function<String, Long> composing = square.composing(toInt);
        composing.apply("4");
    }

}
