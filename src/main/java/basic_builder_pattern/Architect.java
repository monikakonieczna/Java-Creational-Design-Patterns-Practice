package basic_builder_pattern;

import java.awt.*;

/**
 * Architect class performs the role of a director in Builder pattern.
 * The director is used for constructing objects using the builder.
 * In this case creates bedroom objects by specifying the characteristics
 * of the bedroom that are needed.
 */
public class Architect {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom.Builder()
                .setDimensions(new Dimension(200, 100))
                .setCeilingHeight(3)
                .setFloorNumber(2)
                .setWallColor(Color.WHITE)
                .setNumberOfWindows(2)
                .setNumberOfDoors(1)
                .setIsDouble(true)
                .setHasEnsuite(false)
                .createBedroom();

        Bedroom bedroom2 = new Bedroom.Builder()
                .setDimensions(new Dimension(300, 250))
                .createBedroom();
    }
}
