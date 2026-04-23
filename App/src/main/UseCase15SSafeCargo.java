package main;

public class UseCase15SSafeCargo {

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // ✅ Safe
        b1.assignCargo("Petroleum");

        // ❌ Unsafe
        b2.assignCargo("Petroleum");

        // Program continues
        System.out.println("Program continues after handling exception");
    }
}
