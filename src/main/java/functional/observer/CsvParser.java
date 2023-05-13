package functional.observer;

import java.io.BufferedReader;
import java.util.Arrays;

public class CsvParser {

    public static void parse(BufferedReader br, Observer observer) {
        br.lines()
                .flatMap(str -> Arrays.stream(str.split(",")))
                .mapToDouble(Double::parseDouble)
                .forEach(observer::observe);
    }

}
