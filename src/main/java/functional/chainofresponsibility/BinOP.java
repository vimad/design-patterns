package functional.chainofresponsibility;

public class BinOP  implements Expr {

    private final Expr left;
    private final Expr right;
    private final Operator operator;

    public BinOP(Expr left, Expr right, Operator operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return operator.getSymbol() + " " + left + " " + right ;
    }
}
