package main;

import java.util.*;
import java.util.stream.Collectors;


public class UseCase8TrainConsisntMgmt {

    // Method to filter bogies using Stream API
    public static List<Bogie> filterBogies(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.capacity > threshold)
                .collect(Collectors.toList());
    }

    // Main method (for manual run)
    public static void main(String[] args) {
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 80));

        int threshold = 60;

        List<Bogie> filtered = filterBogies(bogies, threshold);

        System.out.println("Filtered Bogies:");
        for (Bogie b : filtered) {
            System.out.println(b);
        }
    }
}