package ex46;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AnimalComparatorTest {

    @Test
    void compare() {
        ArrayList<Animal> animals = new ArrayList<>();
        Animal animalOne = new Animal(1, "snake");
        Animal animalTwo = new Animal(7, "badger");
        animals.add(animalOne);
        animals.add(animalTwo);
        animals.sort(new AnimalComparator());
        assertEquals(7, animals.get(0).getCount());
    }
}