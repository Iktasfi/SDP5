public class DeluxeRoom extends Room {
    private boolean hasJacuzzi;

    public DeluxeRoom(double price, boolean hasJacuzzi) {
        super("Deluxe", price);
        this.hasJacuzzi = hasJacuzzi;
    }

    public boolean hasJacuzzi() {
        return hasJacuzzi;
    }
}
