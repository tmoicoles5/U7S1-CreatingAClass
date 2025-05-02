package partB.storage;


import partB.animals.Cat;

import java.util.HashMap;
import java.util.Map;

public class CatHouse {
    private static Map<Integer, Cat> catMap = new HashMap<>();

    public static void add(Cat cat) {
        catMap.put(cat.getId(), cat);
    }

    public static void remove(Integer id) {
        catMap.remove(id);
    }

    public static void remove(Cat cat) {
        catMap.remove(cat.getId());
    }

    public static Cat getCatById(Integer id) {
        return catMap.get(id);
    }

    public static Integer getNumberOfCats() {
        return catMap.size();
    }

    public static void clear() {
        catMap.clear();
    }
}