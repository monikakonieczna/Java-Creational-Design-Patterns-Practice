package factory_method_pattern_complete;

import java.util.ArrayList;

public class HardCandyCandyCane extends Candy{
    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList hardCandyPackage = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            HardCandyCandyCane candyCane = new HardCandyCandyCane();
            hardCandyPackage.add(candyCane);
        }
        System.out.println(quantity/10 + "packages of 10 candy canes have been made!");
        return hardCandyPackage;
    }
}
