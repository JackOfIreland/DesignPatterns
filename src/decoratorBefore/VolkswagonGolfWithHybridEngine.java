package decoratorBefore;


public class VolkswagonGolfWithHybridEngine extends Car {
    @Override
    public double cost() {
        return 26500;
    }

    public String getDescription() {
        return "VW Golf with Hybrid Engine";
    }
}
