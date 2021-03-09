package creational.builder;

import creational.builder.concretebuilder.CarBuilder;

public class Director {

    public void constructCar(Builder builder) {
        builder.setColor("Red");
        builder.setSeats(4);
    }

    public void constructManualCar(Builder builder) {
        builder.setColor("white");
        builder.setSeats(2);
    }
}
