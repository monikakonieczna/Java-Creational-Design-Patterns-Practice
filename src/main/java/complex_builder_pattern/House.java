package complex_builder_pattern;

import java.awt.*;
import java.util.ArrayList;

/**
 * The house takes a list of rooms as its constructor.
 */
public class House {

    private ArrayList listOfRooms;

    public House(ArrayList listOfRooms) {
        this.listOfRooms = listOfRooms;
    }
}
