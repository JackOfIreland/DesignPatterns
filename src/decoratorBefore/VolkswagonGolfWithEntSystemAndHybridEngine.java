package decoratorBefore;

/**
 * Created by t00168584 on 16/10/2015.
 */
public class VolkswagonGolfWithEntSystemAndHybridEngine extends Car {
    @Override
    public double cost() {
        return 27000;
    }

    public String getDescription() {
        return "Toyota Avensis with entertainment system and hybrid engines";
    }
}
