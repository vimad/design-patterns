package functional.observer;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class CsvReader {

    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = Files.newBufferedReader(Path.of("src/main/java/functional/observer/sample.csv"));
        double sum = bufferedReader.lines()
                .flatMap(str -> Arrays.stream(str.split(",")))
                .mapToDouble(Double::parseDouble)
                .sum();
        System.out.println(sum);
    }
}
