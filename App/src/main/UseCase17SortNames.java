package main;

import java.util.Arrays;

public class UseCase17SortNames {

    public static void sortBogieNames(String[] names) {
        Arrays.sort(names);
    }

    public static void main(String[] args) {

        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        sortBogieNames(bogieNames);

        System.out.println("Sorted: " + Arrays.toString(bogieNames));
    }
}