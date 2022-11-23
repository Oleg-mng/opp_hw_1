package oop_hw_1;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Person> family = new ArrayList<>();
        family.add(new Brother());
        family.add(new Sister());
        family.add(new Mother());
        family.add(new Father());
        family.add(new Grandma());
        family.add(new Grandpa());

        family.forEach(System.out::println);
    }
}

