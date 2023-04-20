package Classes;

import java.time.LocalDate;
import java.util.Date;

public class Wolf extends WildAnimal{
    private boolean leader;
    public Wolf(double height, double weight, String eyeColor, String habitat, LocalDate locationDate, boolean leader){
        super(height, weight, eyeColor, habitat, locationDate);

        this.leader = leader;
    }

    public boolean isLeader() {
        return leader;
    }

    @Override
    public void voice() {
        System.out.println("Ууууу");
    }

    public String toString() {
        return "Волк:\n" +
                super.toString() + "\n" +
                String.format("\tВожак стаи: %s.", (leader)? "да": "нет");
    }

}
