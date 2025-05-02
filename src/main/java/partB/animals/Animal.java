package partB.animals;
import java.util.Date;
import partB.food.Food;

public class Animal {
    private String name;
    private Date birthDate;
    private int id;

    public Animal(String name, Date birthDate, int id) {
        this.name = name;
        this.birthDate = birthDate;
        this.id = id;
    }

    public String speak() {
        return null;
    }

    public Integer getNumberOfMealsEaten() {
        return null;
    }

    public Integer getId() {
        return this.id;
    }

    public void eat(Food food) {
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}