package Classes;

import java.util.ArrayList;
import java.util.List;

public class Zoo extends ArrayList<Animal>{
//    private List<Animal> animals;
//    public Zoo() {
//        animals = new ArrayList<>();
//    }

    public void addAnimal(Animal animal) {
        add(animal);
    }

    public void removeAnimal(Animal animal) {
        remove(animal);
    }

    public void removeAnimal(int index) {
        remove(index);
    }

    public Animal getAnimal(int index) {
        return get(index);
    }

    public void printAll() {
        for (int i = 0; i < size(); i++){
            get(i).printInfo();
        }
    }

    public void voiceAll() {
        for (int i = 0; i < size(); i++){
            get(i).voice();
        }
    }
}
