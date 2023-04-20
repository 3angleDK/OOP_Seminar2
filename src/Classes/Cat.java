package Classes;

import java.time.LocalDate;
import java.util.Date;

public class Cat extends HomeAnimal{
    private boolean coat;
    public Cat(double height, double weight, String eyeColor, String nickName, String breed, boolean vaccinations,
               String coatColor, LocalDate birthDay, boolean coat){
        super(height, weight, eyeColor, nickName, breed, vaccinations, coatColor, birthDay);
        this.coat = coat;
    }

    @Override
    public void showAffection() {
        System.out.println("Мур-мур");
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }

    public String coatToString(){
        return (coat)? "есть" : "нет";
    }
    @Override
    public String toString() {
        return "Кот:\n" +
                super.toString() + "\n" +
                String.format("\tШерсть: %s.", coatToString());
    }
}
