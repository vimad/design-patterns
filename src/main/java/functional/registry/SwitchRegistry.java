package functional.registry;

import functional.registry.model.Ellipse;
import functional.registry.model.Rectangle;
import functional.registry.model.Shape;
import functional.registry.model.Triangle;
import functional.factory.Factory;

public class SwitchRegistry {

    public static Factory<? extends Shape> get(String label) {
        switch (label) {
            case "rectangle": return (Rectangle::new);
            case "triangle": return (Triangle::new);
            case "ellipse": return (Ellipse::new);
            default: throw new RuntimeException("Not found in registry");
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Shape rectangle = get("rectangle").newInstance();
        System.out.println(rectangle);

        Factory<Triangle> triangleFactory = (Factory<Triangle>) get("triangle");
        Shape triangle = triangleFactory.newInstance();
        System.out.println(triangle);
    }

}
