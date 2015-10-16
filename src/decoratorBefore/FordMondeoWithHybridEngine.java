package decoratorBefore;


public class FordMondeoWithHybridEngine extends Car {
    @Override
    public double cost() {
        return 30500;
    }

    public String getDescription() {
        return "Ford Mondeo with Hybrid Engine";
    }
}
