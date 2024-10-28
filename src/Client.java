import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        HotelBookingFacade hotelBookingFacade = new HotelBookingFacade();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Hotel Booking System!");

        while (true) {
            System.out.println("Enter your email (or 'exit' to quit): ");
            String email = scanner.nextLine();

            if (email.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using our booking system! Goodbye.");
                break;
            }

            System.out.println("Enter room type (Single, Double, Suite): ");
            String roomType = scanner.nextLine();

            System.out.println("Enter payment method (Kaspi, Halyk, Cash): ");
            String paymentMethod = scanner.nextLine();

            hotelBookingFacade.bookHotel(email, roomType, paymentMethod);
            System.out.println();
        }

        scanner.close();
    }
}
