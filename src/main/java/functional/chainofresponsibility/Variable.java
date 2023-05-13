package functional.chainofresponsibility;

public class Variable  implements Expr {
    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
