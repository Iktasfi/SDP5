public class Booking {
    private Room room;
    private String customerName;
    private String customerSurname;
    private String customerEmail;
    private String paymentMethod;

    public Booking(Room room, String customerName, String customerSurname, String customerEmail, String paymentMethod) {
        this.room = room;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.customerEmail = customerEmail;
        this.paymentMethod = paymentMethod;
        room.bookRoom();
    }

    public void displayBookingDetails() {
        System.out.println("Room booked: " + room.getType());
        System.out.println("Price: $" + room.getPrice());
        System.out.println("Customer: " + customerName + " " + customerSurname);
        System.out.println("Email: " + customerEmail);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Amenities: " + room.getAmenities());
    }
}
