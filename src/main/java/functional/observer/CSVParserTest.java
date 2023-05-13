package functional.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CSVParserTest {

    public static void main(String[] args) throws IOException {
        double sum = findSum();
        System.out.println("Sum is " + sum);
    }

    private static double findSum() throws IOException {
        BufferedReader bufferedReader = Files.newBufferedReader(Path.of("src/main/java/functional/observer/sample.csv"));
        class Adder {double sum;};
        Adder adder = new Adder();
        CsvParser.parse(bufferedReader, val -> adder.sum += val);
        return adder.sum;
    }
}
