package complete_builder_pattern;

import java.awt.*;

public interface Builder {
    Builder setCeilingHeight(int ceilingHeight);

    Builder setDimensions(Dimension dimensions);

    Builder setFloorNumber(int floorNumber);

    Builder setNumberOfDoors(int numberOfDoors);

    Builder setNumberOfWindows(int numberOfWindows);

    Builder setWallColor(Color wallColor);
}
