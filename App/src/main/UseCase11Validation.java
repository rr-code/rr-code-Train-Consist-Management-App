package main;

import java.util.regex.*;

public class UseCase11Validation {

    // Validate Train ID
    public static boolean isValidTrainID(String trainId) {
        Pattern pattern = Pattern.compile("TRN-\\d{4}");
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    // Validate Cargo Code
    public static boolean isValidCargoCode(String cargoCode) {
        Pattern pattern = Pattern.compile("PET-[A-Z]{2}");
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        System.out.println("Train ID Valid: " + isValidTrainID(trainId));
        System.out.println("Cargo Code Valid: " + isValidCargoCode(cargoCode));
    }
}
