package decoratorBefore;


public class FordMondeoWithEntertainmentSystem extends Car {
    @Override
    public double cost() {
        return 28500;
    }

    public String getDescription() {
        return "Ford Mondeo with entertainment system";
    }
}
