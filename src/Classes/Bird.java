package Classes;

import java.util.Date;

public abstract class Bird extends Animal{
    private double flightAltitude;
    public Bird(double height, double weight, String eyeColor, double flightAltitude){
        super(height, weight, eyeColor);
        this.flightAltitude = flightAltitude;
    }
    public void flight(){
        System.out.printf("Я лечу на %1.1f метрах.\n", flightAltitude);
    }

    public double getFlightAltitude() {
        return flightAltitude;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                String.format("\tВысота полета: %1.1f м.", flightAltitude);
    }

}
