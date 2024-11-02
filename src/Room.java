import java.util.List;

public class Room {
    private String type;
    private double price;
    private boolean available;
    private boolean hasJacuzzi;
    private List<String> amenities;

    public Room(String type, double price, boolean hasJacuzzi, List<String> amenities) {
        this.type = type;
        this.price = price;
        this.available = true;
        this.hasJacuzzi = hasJacuzzi;
        this.amenities = amenities;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public boolean hasJacuzzi() {
        return hasJacuzzi;
    }

    public List<String> getAmenities() {
        return amenities;
    }

    public void bookRoom() {
        this.available = false;
    }

    public void freeRoom() {
        this.available = true;
    }
}