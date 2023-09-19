package org.example;

import java.util.ArrayList;

public class NumberList {
    private final ArrayList<Integer> numbers;

    public NumberList() {
        this.numbers = new ArrayList<>();
    }

    public int getSize() {
        return this.numbers.size();
    }

    public void addNumber(int number) {
        this.numbers.add(number);
    }

    public int getNumberAtIndex(int index) {
        return this.numbers.get(index);
    }
}
