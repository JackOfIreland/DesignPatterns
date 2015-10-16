package decoratorBefore;

/**
 * Created by t00168584 on 16/10/2015.
 */
public class ToyotaAvensisWithEntSystemAndHeatedSeats extends Car {
    @Override
    public double cost() {
        return 27200;
    }

    public String getDescription() {
        return "Toyota Avensis with entertainment system and Heated Seats";
    }
}
