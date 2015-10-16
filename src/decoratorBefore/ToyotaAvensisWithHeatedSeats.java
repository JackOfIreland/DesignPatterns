package decoratorBefore;


public class ToyotaAvensisWithHeatedSeats extends Car {
    @Override
    public double cost() {
        return 26700;
    }

    public String getDescription() {
        return "Toyota Avensis with Heated Sets";
    }
}