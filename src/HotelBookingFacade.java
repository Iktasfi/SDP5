public class HotelBookingFacade {
    private PaymentProcessor paymentProcessor;
    private NotificationService notificationService;
    private Booking booking;

    public HotelBookingFacade() {
        paymentProcessor = new PaymentProcessor();
        notificationService = new NotificationService();
        booking = new Booking();
    }

    public void bookHotel(String customerEmail, String roomType, String paymentMethod) {
        Room room = booking.findAvailableRoom(roomType);
        if (room != null) {
            double amount = room.getPrice();
            booking.bookRoom(room);
            paymentProcessor.processPayment(paymentMethod, amount);
            notificationService.sendBookingConfirmation(customerEmail);
            System.out.println("Hotel booking completed successfully for " + room.getRoomType());
        } else {
            System.out.println("Sorry, the requested room type is not available.");
        }
    }
}
