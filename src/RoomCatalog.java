import java.util.ArrayList;
import java.util.List;

public class RoomCatalog {
    private List<Room> rooms;

    public RoomCatalog() {
        rooms = new ArrayList<>();
        rooms.add(new Room("Single", 100.0, false, new ArrayList<>()));
        rooms.add(new Room("Double", 150.0, false, new ArrayList<>()));
        rooms.add(new DeluxeRoom());
        rooms.add(new SuiteRoom());
    }

    public Room findAvailableRoom(String type) {
        for (Room room : rooms) {
            if (room.getType().equalsIgnoreCase(type) && room.isAvailable()) {
                return room;
            }
        }
        return null;
    }
}