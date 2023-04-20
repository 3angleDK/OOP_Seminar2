package Classes;

import java.time.LocalDate;
import java.util.Date;

public class Tiger extends WildAnimal{
    public Tiger(double height, double weight, String eyeColor, String habitat, LocalDate locationDate){
        super(height, weight, eyeColor, habitat, locationDate);
    }

    @Override
    public void voice() {
        System.out.println("Рррррр");
    }

    public String toString() {
        return "Тигр:\n" + super.toString();
    }
}
