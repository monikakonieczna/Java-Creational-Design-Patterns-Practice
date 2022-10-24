package complex_builder_pattern;

import java.util.ArrayList;

/**
 * Architect class used to create a house.
 */
public class Architect {
    public static void main(String[] args) {
        ArrayList<Room> rooms = new RoomListBuilder()
                .addList()
                .addRoom()
                .setFloorNumber(2)
                .addRoomToList()
                .addRoom()
                .setFloorNumber(1)
                .addRoomToList()
                .buildList();

        House house = new House(rooms);
    }

}
