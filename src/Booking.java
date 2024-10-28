import java.util.ArrayList;
import java.util.List;

public class Booking {
    private List<Room> rooms;

    public Booking() {
        rooms = new ArrayList<>();
        initializeRooms();
    }

    private void initializeRooms() {
        rooms.add(new Room("Single", 100.00));
        rooms.add(new Room("Double", 150.00));
        rooms.add(new Room("Suite", 250.00));
        rooms.add(new DeluxeRoom(300.00, true));
    }

    public Room findAvailableRoom(String roomType) {
        for (Room room : rooms) {
            if (room.getRoomType().equalsIgnoreCase(roomType) && room.isAvailable()) {
                return room;
            }
        }
        return null;
    }

    public void bookRoom(Room room) {
        room.bookRoom();
    }
}
