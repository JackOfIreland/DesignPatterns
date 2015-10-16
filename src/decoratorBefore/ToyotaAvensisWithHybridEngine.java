package decoratorBefore;


public class ToyotaAvensisWithHybridEngine extends Car {
    @Override
    public double cost() {
        return 28500;
    }

    public String getDescription() {
        return "Toyota Avensis with hybrid engine";
    }
}