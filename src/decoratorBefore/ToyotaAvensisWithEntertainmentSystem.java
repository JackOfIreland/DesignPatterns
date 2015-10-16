package decoratorBefore;


public class ToyotaAvensisWithEntertainmentSystem extends Car {
    @Override
    public double cost() {
        return 26500;
    }

    public String getDescription() {
        return "Toyota Avensis with entertainment system";
    }
}
