package decoratorBefore;


public class VolkswagonGolfWithEntertainmentSystem extends Car {
    @Override
    public double cost() {
        return 24500;
    }

    public String getDescription() {
        return "VW Golf with entertainment system";
    }
}
