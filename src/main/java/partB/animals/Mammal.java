package partB.animals;

import java.util.Date;
import partB.food.Food;

import java.util.ArrayList;




public abstract class Mammal extends Animal {
    private int id;
    private String name;
    private Date birthDate;

    private ArrayList<Food> eatenMeals = new ArrayList<>();

    public Mammal(String name, Date birthDate, int id) {
        super(name, birthDate, id);
        this.name = name;
        this.birthDate = birthDate;
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    public Integer getId() {
        return id;
    }


    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public Integer getNumberOfMealsEaten() {
        return eatenMeals.size();
    }

    @Override
    public void eat(Food food) {
        eatenMeals.add(food);
    }
}

