package abstract_factories;

public class RoadBikeTire extends Tire {

    private static final String width = "NARROW";
    private static final String pressure = "HIGH";

    @Override
    void getDescription() {
        System.out.println("Road bike tire width: " + width + ", pressure: " + pressure);
    }
}
