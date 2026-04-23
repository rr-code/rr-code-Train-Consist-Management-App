package main;

import java.util.*;
import java.util.stream.Collectors;

public class UseCase9GroupBogies {

    public static Map<String, List<Bogie>> groupBogiesByType(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));
    }

    public static void main(String[] args) {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 60),
                new Bogie("Sleeper", 80),
                new Bogie("First Class", 40)
        );

        Map<String, List<Bogie>> grouped = groupBogiesByType(bogies);

        grouped.forEach((type, list) -> {
            System.out.println(type + " -> " + list);
        });
    }
}
