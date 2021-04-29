package structural.composite;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {
        Line line1 = new Line(1);
        Line line2 = new Line(2);
        Line line3 = new Line(3);
        Line line4 = new Line(4);

        Box box = new Box(Arrays.asList(line1, line2, line3, line4));

        box.moveRight(12);
    }
}
