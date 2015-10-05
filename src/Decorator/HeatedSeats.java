package Decorator;

public class HeatedSeats extends CarDecorator {
    Car car;

    public HeatedSeats(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return 700 + car.cost();
    }
}
