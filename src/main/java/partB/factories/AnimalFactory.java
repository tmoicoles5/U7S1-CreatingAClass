package partB.factories;

import partB.animals.Dog;
import java.util.Date;

public class AnimalFactory {

    public Dog createDog(String name, Date birthDate) {
        int id = generateId();
        return new Dog(name, birthDate, id);
    }

    private int generateId() {
        return (int) (Math.random() * 10000);
    }
}