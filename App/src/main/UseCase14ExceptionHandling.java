package main;

public class UseCase14ExceptionHandling {

    public static void main(String[] args) {

        try {
            Bogie b1 = new Bogie("Sleeper", 72);   // ✅ valid
            Bogie b2 = new Bogie("AC", -10);       // ❌ invalid

            System.out.println(b1);
            System.out.println(b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}