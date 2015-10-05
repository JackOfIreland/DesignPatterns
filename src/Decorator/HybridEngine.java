package Decorator;

public class HybridEngine extends CarDecorator {
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
