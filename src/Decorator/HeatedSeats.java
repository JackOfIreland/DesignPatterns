package Decorator;

public class HeatedSeats extends CarDecorator {
    Car car;

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return 0;
    }
}
