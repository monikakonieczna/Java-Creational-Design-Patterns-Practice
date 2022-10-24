package basic_builder_pattern;

import java.awt.*;

/**
 * Bedroom class performs the role of a product in Builder pattern.
 * The product is the complex object that needs to be constructed.
 */
public class Bedroom {

    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;

    public Bedroom(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors, boolean isDouble, boolean hasEnsuite) {
        this.dimensions = dimensions;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.isDouble = isDouble;
        this.hasEnsuite = hasEnsuite;
    }

    private Bedroom(Builder builder) {
        dimensions = builder.dimensions;
        ceilingHeight = builder.ceilingHeight;
        floorNumber = builder.floorNumber;
        wallColor = builder.wallColor;
        numberOfWindows = builder.numberOfWindows;
        numberOfDoors = builder.numberOfDoors;
        isDouble = builder.isDouble;
        hasEnsuite = builder.hasEnsuite;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder class performs the role of a builder in Builder pattern
     */
    public static final class Builder {
        private Dimension dimensions;
        private int ceilingHeight;
        private int floorNumber;
        private Color wallColor;
        private int numberOfWindows;
        private int numberOfDoors;
        private boolean isDouble;
        private boolean hasEnsuite;

        Builder() {
        }

        public Builder setDimensions(Dimension val) {
            dimensions = val;
            return this;
        }

        public Builder setCeilingHeight(int val) {
            ceilingHeight = val;
            return this;
        }

        public Builder setFloorNumber(int val) {
            floorNumber = val;
            return this;
        }

        public Builder setWallColor(Color val) {
            wallColor = val;
            return this;
        }

        public Builder setNumberOfWindows(int val) {
            numberOfWindows = val;
            return this;
        }

        public Builder setNumberOfDoors(int val) {
            numberOfDoors = val;
            return this;
        }

        public Builder setIsDouble(boolean val) {
            isDouble = val;
            return this;
        }

        public Builder setHasEnsuite(boolean val) {
            hasEnsuite = val;
            return this;
        }

        public Bedroom createBedroom() {
            return new Bedroom(this);
        }
    }
}
