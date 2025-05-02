package com.codedifferently.labs.partB;

import partB.storage.CatHouse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import partB.animals.Cat;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
public class CatHouseTest {

    private Cat cat1;
    private Cat cat2;

    @BeforeEach
    public void setUp() {
        CatHouse.clear();
        cat1 = new Cat("Whiskers", new Date(), 101);
        cat2 = new Cat("Luna", new Date(), 202);
    }

    @Test
    public void testAddCat() {
        CatHouse.add(cat1);
        Cat retrieved = CatHouse.getCatById(101);
        assertEquals(cat1, retrieved);
    }

    @Test
    public void testRemoveCatById() {
        CatHouse.add(cat1);
        CatHouse.remove(101);
        assertNull(CatHouse.getCatById(101));
    }

    @Test
    public void testRemoveCatByObject() {
        CatHouse.add(cat2);
        CatHouse.remove(cat2);
        assertNull(CatHouse.getCatById(202));
    }

    @Test
    public void testGetCatById() {
        CatHouse.add(cat1);
        Cat retrieved = CatHouse.getCatById(101);
        assertEquals(cat1, retrieved);
    }

    @Test
    public void testGetNumberOfCats() {
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        assertEquals(2, CatHouse.getNumberOfCats());
    }
}
