package com.codedifferently.labs.partB;
import org.junit.jupiter.api.Test;
import partB.animals.Dog;

import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class DogTest {

    @Test
    public void testConstructorAndGetters() {
        // Given
        String expectedName = "Rex";
        Date expectedBirthDate = new Date();
        int expectedId = 101;

        // When
        Dog dog = new Dog(expectedName, expectedBirthDate, expectedId);

        // Then
        assertEquals(expectedName, dog.getName());
        assertEquals(expectedBirthDate, dog.getBirthDate());
        assertEquals(expectedId, dog.getId());
    }

    @Test
    public void testSpeak() {
        // Given
        Dog dog = new Dog("Rex", new Date(), 101);

        // When
        String sound = dog.speak();

        // Then
        assertEquals("bark!", sound);
    }

    @Test
    public void testSetName() {
        // Given
        Dog dog = new Dog("OldName", new Date(), 101);
        String newName = "NewName";

        // When
        dog.setName(newName);

        // Then
        assertEquals(newName, dog.getName());
    }

    @Test
    public void testSetBirthDate() {
        // Given
        Dog dog = new Dog("Rex", new Date(), 101);
        Date newDate = new Date(0); // Epoch date

        // When
        dog.setBirthDate(newDate);

        // Then
        assertEquals(newDate, dog.getBirthDate());
    }
}