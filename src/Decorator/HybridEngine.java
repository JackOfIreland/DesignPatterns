package Decorator;

public class HybridEngine extends CarDecorator {
    Car car;

    public HybridEngine(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", with a Hybrid Engine ";
    }

    @Override
    public double cost() {
        return 2500 + car.cost();
    }
}
