package functional.chainofresponsibility;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Optional;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Expr reversePolishImpl = Expr.parse(Arrays.stream("+ 2 * a 3".split(" ")).iterator());
        System.out.println(reversePolishImpl);

        //functional style
        Iterator<String> it = Arrays.stream("+ 2 * a 3".split(" ")).iterator();
        Expr reversePolishImpl2 = create(it);
        System.out.println(reversePolishImpl2);
    }

    private static Expr create(Iterator<String> it) {
        Function<String, Optional<Expr>> function = token -> Expr.parseBinOp(token, () -> create(it))
                .or(() -> Expr.parseValue(token))
                .or(() -> Expr.parseVariable(token));
        return Expr.parse(it, function);
    }
}
