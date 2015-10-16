package decoratorBefore;

/**
 * Created by t00168584 on 16/10/2015.
 */
public class VolkswagonGolfWithEntSystemAndHeatedSeats extends Car {
    @Override
    public double cost() {
        return 25200;
    }

    public String getDescription() {
        return "VW Golf with entertainment system and heated seats";
    }
}