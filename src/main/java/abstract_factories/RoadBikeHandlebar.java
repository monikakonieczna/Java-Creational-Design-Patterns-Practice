package abstract_factories;

public class RoadBikeHandlebar extends Handlebar {

    private static String type = "DROP";

    @Override
    void getDescription() {
        System.out.println("Road bike handlebar. Type: " + type);
    }
}
