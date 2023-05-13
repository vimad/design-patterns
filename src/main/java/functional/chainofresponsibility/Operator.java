package functional.chainofresponsibility;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public enum Operator {

    ADD("+"), SUB("-"), MUL("*");

    private final String symbol;

    public static final Map<String, Operator> MAP = Arrays.stream(values())
                    .collect(Collectors.toMap(op -> op.symbol, op -> op));

    public String getSymbol() {
        return symbol;
    }

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public static Optional<Operator> parse(String symbol) {
        return Optional.ofNullable(MAP.get(symbol));
    }
}
