import Classes.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat(0.32, 3.5, "карие", "Мурзик",
                "Персидский", true, "Дымчатый", LocalDate.parse("2019-10-12"), true));
        zoo.addAnimal(new Dog(0.47, 34.5, "зеленые", "Шарик",
                "Коли", false, "Рыжий", LocalDate.parse("2017-09-08"), true));
        zoo.addAnimal(new Tiger(0.57, 72.5, "карие", "Амурская область",
                LocalDate.parse("2011-01-10")));
        zoo.addAnimal(new Wolf(0.52, 64.1, "зеленые", "Западная Сибирь",
                LocalDate.parse("2015-10-09"), true));

        zoo.addAnimal(new Chicken(0.52, 64.1, "зеленые", 0.0));
        zoo.addAnimal(new Stork(0.52, 64.1, "зеленые", 950.0));
        zoo.printAll();
        for (Animal animal: zoo) {
            animal.voice();
            if (animal instanceof HomeAnimal) {
                ((HomeAnimal) animal).showAffection();
            }
            if (animal instanceof Bird) {
                ((Bird) animal).flight();
            }
        }
    }
}