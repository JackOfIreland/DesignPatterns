package decoratorBefore;


public class FordMondeoWithHeatedSeats extends Car {
    @Override
    public double cost() {
        return 28700;
    }

    public String getDescription() {
        return "Ford Mondeo with Heated Seats";
    }
}
