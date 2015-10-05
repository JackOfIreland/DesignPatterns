package Decorator;

public class EntertainmentSystem extends CarDecorator {
    Car car;

    public EntertainmentSystem(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public double cost() {
        return 500 + car.cost();
    }
}
