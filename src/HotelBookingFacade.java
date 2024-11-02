public class HotelBookingFacade {
    private RoomCatalog roomCatalog;
    private PaymentProcessor paymentProcessor;

    public HotelBookingFacade() {
        roomCatalog = new RoomCatalog();
        paymentProcessor = new PaymentProcessor();
    }

    public void bookRoom(String type, String name, String surname, String email, String paymentMethod) {
        Room room = roomCatalog.findAvailableRoom(type);
        if (room != null) {
            if (paymentProcessor.processPayment(paymentMethod, room.getPrice())) {
                Booking booking = new Booking(room, name, surname, email, paymentMethod);
                booking.displayBookingDetails();
                System.out.println("Booking confirmed!");
            } else {
                System.out.println("Payment failed.");
            }
        } else {
            System.out.println("Room of type " + type + " is not available.");
        }
    }
}
