package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Animal {

    private int count;
    private String name;

    public Animal(int count, String name) {
        this.count = count;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getCount() {
        return count;
    }

}
