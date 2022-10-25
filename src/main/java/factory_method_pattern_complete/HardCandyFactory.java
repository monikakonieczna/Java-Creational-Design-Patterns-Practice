package factory_method_pattern_complete;

import java.util.ArrayList;

public class HardCandyFactory extends CandyFactory {
    @Override
    public Candy getCandy(String type) {
        return switch (type) {
            case "candycane" -> new HardCandyCandyCane();
            case "lollipop" -> new HardCandyLollipop();
            case "peppermint" -> new HardCandyPeppermint();
            default -> null;
        };
    }

    @Override
    public ArrayList getCandyPackage(int quantity, String type) {
        Candy candy = getCandy(type);
        if (quantity % 10 != 0) {
            System.out.println("Hard candy must be packaged in multiples of 10.");
            return null;
        }
        ArrayList candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }
}
