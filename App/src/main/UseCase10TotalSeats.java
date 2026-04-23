package main;

import java.util.*;

public class UseCase10TotalSeats {

    public static int calculateTotalSeats(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 60),
                new Bogie("Sleeper", 80)
        );

        int total = calculateTotalSeats(bogies);

        System.out.println("Total Seats: " + total);
    }
}