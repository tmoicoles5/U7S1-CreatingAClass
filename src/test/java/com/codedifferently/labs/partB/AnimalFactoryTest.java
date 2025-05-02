package com.codedifferently.labs.partB;

import partB.animals.Dog;
import partB.factories.AnimalFactory;
import partB.storage.DogHouse;

import java.util.Date;

public class AnimalFactoryTest {
    public static void main(String[] args) {

        AnimalFactory animalFactory = new AnimalFactory();


        Dog dog = animalFactory.createDog("Rex", new Date());


        DogHouse.add(dog);


        System.out.println("Number of dogs in DogHouse: " + DogHouse.getNumberOfDogs());


        System.out.println("Dog created: " + DogHouse.getDogById(dog.getId()).getName() +
                " | ID: " + DogHouse.getDogById(dog.getId()).getId());
    }
}