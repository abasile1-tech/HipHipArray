package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(5);
        numbers.add(7);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}