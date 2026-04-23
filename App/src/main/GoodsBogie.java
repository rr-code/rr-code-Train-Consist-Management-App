package main;

public class GoodsBogie {

    public String type;
    public String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " - " + cargo;
    }
}