package Classes;

public class Stork extends Bird{
    public Stork(double height, double weight, String eyeColor, double flightAltitude){
        super(height, weight, eyeColor, flightAltitude);
    }

    @Override
    public void voice() {
        System.out.println("Курлык");
    }

    public String toString() {
        return "Аист:\n" + super.toString();
    }

}
