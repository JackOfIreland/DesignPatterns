package decoratorBefore;


public class VolkswagonGolfWithHeatedSeats extends Car {
    @Override
    public double cost() {
        return 24700;
    }

    public String getDescription() {
        return "VW Golf with Heated Seats ";
    }
}
