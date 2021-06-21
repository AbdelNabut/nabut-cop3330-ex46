package ex46;

import java.util.Comparator;

public  class AnimalComparator implements Comparator<Animal> {
    public int compare(Animal animalOne, Animal animalTwo) {
        return animalTwo.getCount() - animalOne.getCount();
    }
}
