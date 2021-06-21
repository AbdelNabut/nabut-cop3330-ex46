package ex46;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AppTest 
{
    @org.junit.jupiter.api.Test
    void getAnimals() throws FileNotFoundException {
        File file = new File("src/main/java/ex46/exercise46_input.txt");
        ArrayList<Animal> expectedAnimals = new ArrayList<>();
        ArrayList<Animal> animals = new ArrayList<>();
        Animal expectedBadger = new Animal(7, "badger");
        Animal expectedMushroom = new Animal(2, "mushroom");
        Animal expectedSnake = new Animal(1, "snake");
        expectedAnimals.add(expectedBadger);
        expectedAnimals.add(expectedMushroom);
        expectedAnimals.add(expectedSnake);
        String word;
        int badgerCount = 0;
        int mushroomCount = 0;
        int snakeCount = 0;
        Scanner reader = new Scanner(file);
        while(reader.hasNext()) {
            word = reader.next();
            if(word.equals("badger"))
                badgerCount++;
            if(word.equals("mushroom"))
                mushroomCount++;
            if(word.equals("snake"))
                snakeCount++;
        }
        Animal badger = new Animal(badgerCount, "badger");
        Animal mushroom = new Animal(mushroomCount, "mushroom");
        Animal snake = new Animal(snakeCount, "snake");
        animals.add(badger);
        animals.add(mushroom);
        animals.add(snake);
        for(int i = 0; i < animals.size(); i++) {
            assertEquals(expectedAnimals.get(i).getCount(), animals.get(i).getCount());
            assertEquals(expectedAnimals.get(i).getName(), animals.get(i).getName());
        }
    }
}
