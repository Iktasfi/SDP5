import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HotelBookingFacade hotelBookingFacade = new HotelBookingFacade();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Hotel Booking System!");

        while (true) {
            System.out.println("Enter your email (or 'exit' to quit): ");
            String email = scanner.nextLine();
            if (email.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the Hotel Booking System! Goodbye.");
                break;
            }

            System.out.println("Enter room type (Single, Double, Suite, Deluxe): ");
            String roomType = scanner.nextLine();

            System.out.println("Enter payment method (Credit Card, Debit Card, PayPal): ");
            String paymentMethod = scanner.nextLine();

            hotelBookingFacade.bookHotel(email, roomType, paymentMethod);
            System.out.println();
        }

        scanner.close();
    }
}
