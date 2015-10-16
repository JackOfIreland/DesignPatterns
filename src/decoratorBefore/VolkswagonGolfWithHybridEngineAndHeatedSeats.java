package decoratorBefore;

/**
 * Created by t00168584 on 16/10/2015.
 */
public class VolkswagonGolfWithHybridEngineAndHeatedSeats extends Car{
    @Override
    public double cost() {
        return 27200;
    }

    public String getDescription() {
        return "VW Golf with Hybrid Engine and Heated Seats";
    }
}