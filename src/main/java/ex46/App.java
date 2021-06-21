/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ex46;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    // read file word by word
    // increment count of animal each time that animal is read
    // instantiate animal with animal name and count
    // add animals to ArrayList
    // sort animals
    // loop through each animals count adding an asterisk to histrogram for each count.
    // print results

    public static ArrayList<Animal> getAnimals(File file) throws FileNotFoundException {
        ArrayList<Animal> animals = new ArrayList<>();
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
        return animals;
    }

    public static void main( String[] args ) throws IOException {
        File file = new File("src/main/java/ex46/exercise46_input.txt");

        ArrayList<Animal> animals = getAnimals(file);
        animals.sort(new AnimalComparator());

        for(Animal animal : animals) {
            System.out.print(animal.getName() + ": ");
            for(int i = 0; i < animal.getCount(); i++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}
