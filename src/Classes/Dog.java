package Classes;

import java.time.LocalDate;
import java.util.Date;

public class Dog extends HomeAnimal {
    private boolean trained;

    public Dog(double height, double weight, String eyeColor, String nickName, String breed, boolean vaccinations,
               String coatColor, LocalDate birthDay, boolean trained) {
        super(height, weight, eyeColor, nickName, breed, vaccinations, coatColor, birthDay);
        this.trained = trained;
    }
    public void train(){
        System.out.println("Собаку дрессируют");
    }

    public boolean isTrained() {
        return trained;
    }

    @Override
    public void voice() {
        System.out.println("Гав-гав");
    }

    @Override
    public void showAffection() {
        System.out.println("Виляет хвостом");
    }

    public String toString() {
        return "Собака:\n" +
                super.toString() + "\n" +
                String.format("\tДрессированная: %s.", (trained)? "да": "нет");
    }

}
