package functional.factory;

import java.awt.*;

public class FactoryTester {

    public static void main(String[] args) {
        Factory<Circle> circleFactory = Factory.createFactory(Circle::new);

        Circle circle = circleFactory.newInstance();
        System.out.println(circle);

        Factory<Circle> circleFactory2 = Factory.createFactory(Circle::new, Color.RED);
        Circle circle2 = circleFactory2.newInstance();
        System.out.println(circle2);

    }
}
