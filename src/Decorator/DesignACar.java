package Decorator;

import javax.swing.*;

public class DesignACar {
    public static void main(String[] args) {

        Car c;

        String[] carModels = new String[3];
        carModels[0] = "Ford Mondeo";
        carModels[1] = "Toyota Avensis";
        carModels[2] = "Volkswagon Golf";

        String[] yesNo = new String[2];
        yesNo[0]= "Yes";
        yesNo[1]= "No";

        int carChoice = JOptionPane.showOptionDialog(null,
                "Choose your base car model:","Choose an option",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, null, carModels ,"Metric");

        if (carChoice == 0){
            c = new FordMondeo();
        }
        else if (carChoice == 1){
            c = new ToyotaAvensis();
        }
        else{
            c = new VolkswagonGolf();
        }

        int entertainmentChoice = JOptionPane.showOptionDialog(null,
                "Would you like to add on an Entertainment System?","Choose an option",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, null, yesNo ,"Yes");

        int engineChoice = JOptionPane.showOptionDialog(null,
                "Would you like to add on a Hybrid Engine?","Choose an option",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, null, yesNo ,"Yes");

        int seatsChoice = JOptionPane.showOptionDialog(null,
                "Would you like to add on Heated Seats?","Choose an option",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, null, yesNo ,"Yes");

        if (entertainmentChoice == 0){
            c = new EntertainmentSystem(c);
        }
        if (engineChoice == 0){
            c = new HybridEngine(c);
        }
        if (seatsChoice == 0){
            c = new HeatedSeats(c);
        }

        String fullDescription = c.getDescription();
        if((seatsChoice == 1)&&(engineChoice == 1)&&(entertainmentChoice==1)) {
            fullDescription = fullDescription + "no add-ons";
        }
        double totalCost = c.cost();
        JOptionPane.showMessageDialog(null,"Your car details are as follows:\n" + fullDescription + "\n\nThe total cost of your car is €" + Double.toString(totalCost));



    }
}
