package functional.chainofresponsibility;

import java.util.Iterator;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public interface Expr {

    public static Optional<Expr> parseVariable(String token) {
        return Optional.of(new Variable(token));
    }

    public static Optional<Expr> parseValue(String token) {
        try {
            return Optional.of(new Value(Double.parseDouble(token)));
        } catch (NumberFormatException ex) {
            return Optional.empty();
        }
    }

    public static Optional<Expr> parseBinOp(String token, Supplier<Expr> supplier) {
        return Operator.parse(token)
                .map(op -> new BinOP(supplier.get(), supplier.get(), op));
    }

    public static Expr parse(Iterator<String> it,
                             Function<String, Optional<Expr>> function) {
        String next = it.next();
        return function.apply(next).orElseThrow();
    }

    public static Expr parse(Iterator<String> itr) {
        String next = itr.next();
        Optional<Operator> operator = Operator.parse(next);
        if (operator.isPresent()) {
            Expr left = parse(itr);
            Expr right = parse(itr);
            return new BinOP(left, right, operator.get());
        }

        try {
            return new Value(Double.parseDouble(next));
        } catch (NumberFormatException ex) {
            return new Variable(next);
        }
    }

}
