import java.util.*;

public class train {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for Passenger Bogies
        List<String> passengerBogies = new ArrayList<>();

        // 🔹 Add Bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nAfter Adding Bogies:");
        System.out.println(passengerBogies);

        // 🔹 Remove a Bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println(passengerBogies);

        // 🔹 Check if Sleeper exists
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nIs 'Sleeper' present? " + exists);

        // 🔹 Final State
        System.out.println("\nFinal Passenger Bogie List:");
        System.out.println(passengerBogies);

        System.out.println("\nSystem ready for further operations...");
    }
}