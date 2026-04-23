package main;

public class Bogie {

    public String type;
    public int capacity;

    public Bogie(String type, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " - Capacity: " + capacity;
    }
}