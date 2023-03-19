package functional.chaining;

public class ConsumerTest {

    public static void main(String[] args) {
        Consumer<String> consumer1 = str -> System.out.println("consumer 1 - " + str);
        Consumer<String> consumer2 = str -> System.out.println("consumer 2 - " + str);

        Consumer<String> consumer3 = consumer1.andThen(consumer2);

        consumer3.accept("test string");
    }
}
