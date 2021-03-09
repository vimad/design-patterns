package creational.builder.concretebuilder;

import creational.builder.Builder;
import creational.builder.product.Car;
import creational.builder.product.ManualCar;

public class ManualCarBuilder implements Builder {
    private int seats;
    private String color;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ManualCar getCar() {
        return new ManualCar(seats, color);
    }
}
