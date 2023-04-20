package Classes;

import Interfaces.IAnimal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public abstract class   Animal implements IAnimal {
    private double height;
    private double weight;
    private String eyeColor;
    public Animal(double height, double weight, String eyeColor){

        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public abstract void voice();
    public void printInfo(){
        System.out.println(this);
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String dateToString(LocalDate date) {
        return date.toString();
    }

    @Override
    public String toString() {
        return String.format("\tРост: %1.1f, вес: %1.1f, цвет глаз: %s.", height, weight, eyeColor);
    }
}
