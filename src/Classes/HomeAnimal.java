package Classes;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public abstract class HomeAnimal extends Animal{
    private String nickName;
    private String breed;
    private boolean vaccinations;
    private String coatColor;
    private LocalDate birthDay;
    public HomeAnimal(double height, double weight, String eyeColor, String nickName, String breed, boolean vaccinations, String coatColor, LocalDate birthDay){
        super(height,weight,eyeColor);
        this.nickName = nickName;
        this.breed = breed;
        this.vaccinations = vaccinations;
        this.coatColor = coatColor;
        this.birthDay = birthDay;
    }
    public String vaccinationsToString(){
        return (vaccinations)? "есть" : "нет";
    }

    public abstract void showAffection();

    public String getNickName() {
        return nickName;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isVaccinations() {
        return vaccinations;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                String.format("\tКличка: %s, порода: %s, прививки: %s, цвет шерсти: %s, дата рождения: %s.",
                        nickName, breed, vaccinationsToString(), coatColor, dateToString(birthDay));
    }


}
