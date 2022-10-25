package factory_method_pattern_complete;

public class ChocolateFactory extends CandyFactory {
    @Override
    public Candy getCandy(String section) {
        return switch (section) {
            case "dark" -> new ChocolateDark();
            case "white" -> new ChocolateWhite();
            case "milk" -> new ChocolateMilk();
            default -> null;
        };
    }
}
