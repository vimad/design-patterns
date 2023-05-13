package functional.chainofresponsibility;

public class Value implements Expr {

    private final double value;

    public Value(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
