package Classes;

import java.time.LocalDate;
import java.util.Date;

public abstract class WildAnimal extends Animal{
    private String habitat;
    private LocalDate locationDate;
    public WildAnimal(double height, double weight, String eyeColor, String habitat, LocalDate locationDate){
        super(height, weight, eyeColor);

        this.habitat = habitat;
        this.locationDate = locationDate;
    }

    public String getHabitat() {
        return habitat;
    }

    public LocalDate getLocationDate() {
        return locationDate;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +
                String.format("\tМесто обитания: %s, дата обнаружения: %s.",
                        habitat, dateToString(locationDate));
    }

}
