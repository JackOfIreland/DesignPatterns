package decoratorBefore;

public class VolkswagonGolf extends Car {
    @Override
    public double cost() {
        return 24000;
    }

    public String getDescription() {
        return "Volkswagon golf with no extras ";
    }


}
