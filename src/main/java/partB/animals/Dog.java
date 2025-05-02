package partB.animals;

import java.util.Date;

public class Dog extends Mammal {
    private int id;

    public Dog(String name, Date birthDate, int id) {
        super(name, birthDate,id);
        this.id = id;
    }

    public String speak() {
        return "bark!";
    }
}
