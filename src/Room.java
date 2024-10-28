public class Room {
    private String type;
    private double price;
    private boolean available;

    public Room(String type, double price) {
        this.type = type;
        this.price = price;
        this.available = true;
    }

    public String getRoomType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void bookRoom() {
        this.available = false;
    }

    public void freeRoom() {
        this.available = true;
    }
}
