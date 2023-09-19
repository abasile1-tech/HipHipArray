package org.example;

public class Peacock {
    private final String[] colors;

    public Peacock() {
        this.colors = new String[] {"Brown", "Green", "Yellow", "Blue"};
    }

    public String[] getColors() {
        return this.colors;
    }

    public String getColorFromIndex(int index) {
        return this.colors[index];
    }
}
