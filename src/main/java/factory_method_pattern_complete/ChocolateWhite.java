package factory_method_pattern_complete;

import java.util.ArrayList;

public class ChocolateWhite extends Candy{
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList chocolatePackage = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            ChocolateWhite chocolateWhite = new ChocolateWhite();
            chocolatePackage.add(chocolateWhite);
        }
        System.out.println("One package of " + quantity + " white chocolates has been made!");
        return chocolatePackage;
    }
}
