package structural.composite;

import java.util.List;

public class Box implements Shape{

    List<Shape> shapeList;

    Box(List<Shape> shapes) {
        shapeList = shapes;
    }

    @Override
    public void moveRight(int amount) {
        for (Shape shape : shapeList) {
            shape.moveRight(amount);
        }
    }
}
