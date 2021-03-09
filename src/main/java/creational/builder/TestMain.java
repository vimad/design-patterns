package creational.builder;

import creational.builder.concretebuilder.CarBuilder;
import creational.builder.concretebuilder.ManualCarBuilder;
import creational.builder.product.Car;
import creational.builder.product.ManualCar;

public class TestMain {
    public static void main(String[] args) {

        CarBuilder carBuilder = new CarBuilder();
        ManualCarBuilder manualCarBuilder = new ManualCarBuilder();

        Director director = new Director();
        director.constructCar(carBuilder);
        Car car = carBuilder.getCar();
        System.out.println(car);

        director = new Director();
        director.constructManualCar(manualCarBuilder);
        ManualCar manualCar = manualCarBuilder.getCar();
        System.out.println(manualCar);
    }
}
