package creational.builder.concretebuilder;

import creational.builder.Builder;
import creational.builder.product.Car;

public class CarBuilder implements Builder {
    private int seats;
    private String color;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car getCar() {
        return new Car(seats, color);
    }
}
