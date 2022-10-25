package factory_method_pattern;

import java.util.ArrayList;

public class Chocolate extends Candy {

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList chocolatePackage = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            Chocolate chocolate = new Chocolate();
            chocolatePackage.add(chocolate);
        }
        System.out.println("One package of " + quantity + " chocolates has been made!");
        return chocolatePackage;
    }
}
