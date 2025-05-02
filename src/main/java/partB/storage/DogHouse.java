package partB.storage;


import partB.animals.Dog;


import java.util.HashMap;
import java.util.Map;

public class DogHouse {
    private static Map<Integer, Dog> dogMap = new HashMap<>();


    public static void clear() {
        dogMap.clear();
    }
    public static void add(Dog dog) {
        dogMap.put(dog.getId(),dog);
    }

    public static void remove(Integer id) {
        dogMap.remove(id);
    }

    public static void remove(Dog dog) {
        dogMap.remove(dog.getId());
    }

    public static Dog getDogById(Integer id) {
        return dogMap.get(id);
    }

    public static Integer getNumberOfDogs() {
        return dogMap.size();
    }


    }