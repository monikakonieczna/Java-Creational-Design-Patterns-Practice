package factory_method_pattern_complete;

import java.util.ArrayList;

public abstract class Candy {
    abstract ArrayList<Candy> makeCandyPackage(int quantity);
}
