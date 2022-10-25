package abstract_factories;

public class MountainBikeHandlebar extends Handlebar {

    private static String type = "FLAT";

    @Override
    void getDescription() {
        System.out.println("Mountain bike handlebar. Type: " + type);
    }
}
