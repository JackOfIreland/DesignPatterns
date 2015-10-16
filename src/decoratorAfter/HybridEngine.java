package decoratorAfter;

import decoratorBefore.Car;

public class HybridEngine extends CarDecorator {
    Car car;

    public HybridEngine(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", a Hybrid Engine ";
    }

    @Override
    public double cost() {
        return 2500 + car.cost();
    }
}
