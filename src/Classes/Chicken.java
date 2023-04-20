package Classes;

public class Chicken extends Bird{

    public Chicken(double height, double weight, String eyeColor, double flightAltitude){
        super(height, weight, eyeColor, flightAltitude);
    }

    @Override
    public void voice() {
        System.out.println("Ко-ко-ко");
    }

    public String toString() {
        return "Курица:\n" + super.toString();
    }

}
