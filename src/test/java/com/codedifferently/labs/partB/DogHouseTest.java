import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import partB.animals.Dog;
import partB.storage.DogHouse;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class DogHouseTest {

    private Dog dog1;
    private Dog dog2;

    @BeforeEach
    public void setUp() {
        DogHouse.clear();
        dog1 = new Dog("Rex", new Date(), 101);
        dog2 = new Dog("Bella", new Date(), 202);
    }

    @Test
    public void testAddDog() {
        DogHouse.add(dog1);
        Dog retrieved = DogHouse.getDogById(101);
        assertEquals(dog1, retrieved);
    }

    @Test
    public void testRemoveDogById() {
        DogHouse.add(dog1);
        DogHouse.remove(101);
        assertNull(DogHouse.getDogById(101));
    }

    @Test
    public void testRemoveDogByObject() {
        DogHouse.add(dog2);
        DogHouse.remove(dog2);
        assertNull(DogHouse.getDogById(202));
    }

    @Test
    public void testGetDogById() {
        DogHouse.add(dog1);
        Dog retrieved = DogHouse.getDogById(101);
        assertEquals(dog1, retrieved);
    }

    @Test
    public void testGetNumberOfDogs() {
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        assertEquals(2, DogHouse.getNumberOfDogs());
    }
}