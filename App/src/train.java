import java.util.*;

public class train {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // 🔹 Create LinkedHashSet for Train Formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // 🔹 Add Bogies (Insertion Order Preserved)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // 🔹 Attempt to add duplicate
        trainFormation.add("Sleeper"); // duplicate (ignored)

        // 🔹 Display Formation
        System.out.println("\nFinal Train Formation (Ordered & Unique):");
        System.out.println(trainFormation);

        System.out.println("\nTotal Bogies: " + trainFormation.size());

        System.out.println("\nSystem preserves order and prevents duplicates.");
    }
}