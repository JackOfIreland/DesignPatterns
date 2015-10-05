package Decorator;

public abstract class Car {

    String description = "undefined";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();



}
