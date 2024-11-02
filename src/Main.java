import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HotelBookingFacade hotelBookingFacade = new HotelBookingFacade();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Hotel Booking System!");

        while (true) {
            System.out.println("Enter your name (or 'exit' to quit): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the Hotel Booking System! Goodbye.");
                break;
            }

            System.out.println("Enter your surname: ");
            String surname = scanner.nextLine();

            System.out.println("Enter your email: ");
            String email = scanner.nextLine();

            System.out.println("Enter room type (Single, Double, Suite, Deluxe): ");
            String roomType = scanner.nextLine();

            System.out.println("Enter payment method (Kaspi, Halyk, Qiwi): ");
            String paymentMethod = scanner.nextLine();

            hotelBookingFacade.bookRoom(roomType, name, surname, email, paymentMethod);
            System.out.println();
        }

        scanner.close();
    }
}