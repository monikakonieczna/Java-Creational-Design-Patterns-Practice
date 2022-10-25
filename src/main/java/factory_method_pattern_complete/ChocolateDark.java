package factory_method_pattern_complete;

import java.util.ArrayList;

public class ChocolateDark extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList chocolatePackage = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            ChocolateDark chocolateDark = new ChocolateDark();
            chocolatePackage.add(chocolateDark);
        }
        System.out.println("One package of " + quantity + " dark chocolates has been made!");
        return chocolatePackage;
    }
}
