package functional.registry;

import functional.registry.model.Rectangle;
import functional.registry.model.Shape;
import functional.registry.model.Triangle;
import functional.chaining.Consumer;

public class BuilderTester {

    public static void main(String[] args) {

        Consumer<Builder<Shape>> rectangleConsumer = builder -> builder.register("rectangle", Rectangle::new);
        Consumer<Builder<Shape>> triangleConsumer = builder -> builder.register("triangle", Triangle::new);

        Consumer<Builder<Shape>> compose = rectangleConsumer.andThen(triangleConsumer);

        Registry<Shape> shapeRegistry = Registry.createRegistry(compose);

        Shape rectangle = shapeRegistry.buildFactory("rectangle").newInstance();
        System.out.println(rectangle);

        Shape triangle = shapeRegistry.buildFactory("triangle").newInstance();
        System.out.println(triangle);
    }
}
