package factory_method_pattern_complete;

import java.util.ArrayList;

public class HardCandyLollipop extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList hardCandyPackage = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            HardCandyLollipop lollipop = new HardCandyLollipop();
            hardCandyPackage.add(lollipop);
        }
        System.out.println("One package of " + quantity + "hard candy has been made!");
        return hardCandyPackage;
    }
}
