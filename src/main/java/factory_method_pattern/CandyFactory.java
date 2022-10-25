package factory_method_pattern;

import java.util.ArrayList;

public class CandyFactory {

    public static Candy getCandy(String type) {
        return switch (type) {
            case "hard candy" -> new HardCandy();
            case "chocolate" -> new Chocolate();
            default -> null;
        };
    }

    public static ArrayList getCandyPackage(int quantity, String type) {
        Candy candy = getCandy(type);
        ArrayList candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }
}
