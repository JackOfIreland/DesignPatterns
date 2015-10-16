package decoratorBefore;

/**
 * Created by t00168584 on 16/10/2015.
 */
public class ToyotaAvensisWithHybridEngineAndHeatedSeats extends Car {
    @Override
    public double cost() {
        return 29200;
    }

    public String getDescription() {
        return "Toyota Avensis with Hybrid Engine and Heated Seats";
    }
}