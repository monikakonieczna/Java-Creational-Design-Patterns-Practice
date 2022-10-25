package factory_method_pattern_complete;

import java.util.ArrayList;

public class HardCandyPeppermint extends Candy {
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList hardCandyPackage = new ArrayList<>();
        for (int i = 1; i <= quantity; i++) {
            HardCandyPeppermint peppermint = new HardCandyPeppermint();
            hardCandyPackage.add(peppermint);
        }

        System.out.println("One package of " + quantity + " peppermints has been made!");
        return hardCandyPackage;
    }
}
