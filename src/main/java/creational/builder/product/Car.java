package creational.builder.product;

public class Car {
    private int seats;
    private String colour;

    public Car(int seats, String colour) {
        this.seats = seats;
        this.colour = colour;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "car";
    }
}
