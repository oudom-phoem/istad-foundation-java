package cinema_booking;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Main {

    static final String ADMIN_USERNAME = "admin";
    static final String ADMIN_PASSWORD = "password";
    static final int MAX_HISTORY = 100;
    static String[][] bookingHistory = new String[MAX_HISTORY][2];
    static int bookingCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] seats = null;
        int rows = 0, columns = 0;
        char charRow = 'A';

        while (true) {
            displayMenu();
            byte choice = scanner.nextByte();

            switch (choice) {
                case 1 -> {
                    if (isAdminValid(getUsername(scanner), getPassword(scanner))) {
                        rows = getRows(scanner);
                        columns = getColumns(scanner);
                        seats = new int[rows][columns];
                        displaySeats(rows, columns, seats, charRow);
                    }
                }
                case 2 -> bookSeat(scanner, seats, rows, columns, charRow);
                case 3 -> cancelBooking(scanner, seats, rows, columns, charRow);
                case 4 -> displaySeatsIfSet(seats, rows, columns, charRow);
                case 5 -> displayBookingHistory();
                case 6 -> exitApplication();
                default -> System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    static void displayMenu() {
        System.out.print("""
                \nCinema Hall Seat Booking Application
                Menu:
                1. Set up the seats (Admin only)
                2. Book a seat
                3. Cancel a booking
                4. Display seats
                5. View booking history
                6. Exit
                >\s""");
    }

    static String getUsername(Scanner scanner) {
        scanner.nextLine();
        System.out.print("Enter username: ");
        return scanner.nextLine();
    }

    static String getPassword(Scanner scanner) {
        System.out.print("Enter password: ");
        return scanner.nextLine();
    }

    static boolean validateUsername(String inputUsername) {
        return inputUsername.equals(ADMIN_USERNAME);
    }

    static boolean validatePassword(String inputPassword) {
        return inputPassword.equals(ADMIN_PASSWORD);
    }

    static boolean isAdminValid(String username, String password) {
        if (validateUsername(username) && validatePassword(password)) {
            return true;
        } else {
            System.out.println("Incorrect username or password!");
            return false;
        }
    }

    static int getRows(Scanner scanner) {
        System.out.print("Enter number of rows: ");
        return scanner.nextInt();
    }

    static int getColumns(Scanner scanner) {
        System.out.print("Enter number of columns: ");
        return scanner.nextInt();
    }

    static void displaySeats(int rows, int columns, int[][] seats, char charRow) {
        for (int i = 0; i < rows; i++) {
            System.out.print("[");
            for (int j = 0; j < columns; j++) {
                String seatCode = charRow + "" + (j + 1) + ":";
                String bookStatus = seats[i][j] == 0 ? "⬜" : "🟩";
                System.out.print(seatCode + bookStatus + (j == columns - 1 ? "" : "| "));
            }
            System.out.println("]");
            charRow++;
        }
    }

    static void bookSeat(Scanner scanner, int[][] seats, int rows, int columns, char charRow) {
        if (!isSeatsSet(seats)) return;

        scanner.nextLine();
        System.out.print("Enter the seat code to book (e.g., B3): ");
        String seatCodeToBook = scanner.nextLine().toUpperCase();

        int[] seatIndices = parseSeatCode(seatCodeToBook, rows, columns);
        if (seatIndices == null) return;

        int seatRowIndex = seatIndices[0];
        int seatColumnIndex = seatIndices[1];

        if (seats[seatRowIndex][seatColumnIndex] == 0) {
            seats[seatRowIndex][seatColumnIndex] = 1;
            addBookingHistory(seatCodeToBook);
            System.out.println("Seat " + seatCodeToBook + " successfully booked.");
            displaySeats(rows, columns, seats, charRow);
        } else {
            System.out.println("Seat " + seatCodeToBook + " is already booked.");
        }
    }

    static void cancelBooking(Scanner scanner, int[][] seats, int rows, int columns, char charRow) {
        if (!isSeatsSet(seats)) return;

        scanner.nextLine();
        System.out.print("Enter the seat code to cancel (e.g., B3): ");
        String seatCodeToCancel = scanner.nextLine().toUpperCase();

        int[] seatIndices = parseSeatCode(seatCodeToCancel, rows, columns);
        if (seatIndices == null) return;

        int seatRowIndex = seatIndices[0];
        int seatColumnIndex = seatIndices[1];

        if (seats[seatRowIndex][seatColumnIndex] == 1) {
            seats[seatRowIndex][seatColumnIndex] = 0;
            removeBookingHistory(seatCodeToCancel);
            System.out.println("Seat " + seatCodeToCancel + " successfully cancelled.");
            displaySeats(rows, columns, seats, charRow);
        } else {
            System.out.println("Seat " + seatCodeToCancel + " is not booked.");
        }
    }

    static void displaySeatsIfSet(int[][] seats, int rows, int columns, char charRow) {
        if (!isSeatsSet(seats)) return;
        displaySeats(rows, columns, seats, charRow);
    }

    static void displayBookingHistory() {
        if (bookingCount == 0) {
            System.out.println("No booking history available.");
        } else {
            System.out.println("Booking History:");
            for (int i = 0; i < bookingCount; i++) {
                System.out.println("Seat: " + bookingHistory[i][0] + ", Date: " + bookingHistory[i][1]);
            }
            System.out.println("Total booked: " + bookingCount);
        }
    }

    static void exitApplication() {
        System.out.println("Thank you for using the Cinema Hall Seat Booking system. Goodbye!");
        System.exit(0);
    }

    static boolean isSeatsSet(int[][] seats) {
        if (seats == null) {
            System.out.println("Seats have not been set up. Please set up the seats first.");
            return false;
        }
        return true;
    }

    static  int[] parseSeatCode(String seatCode, int rows, int columns) {
        if (!isValidSeatCode(seatCode, rows, columns)) {
            System.out.println("Invalid seat code. Please try again.");
            return null;
        }

        int seatRowIndex = seatCode.charAt(0) - 'A';
        int seatColumnIndex = Integer.parseInt(seatCode.substring(1)) - 1;
        return new int[]{seatRowIndex, seatColumnIndex};
    }

    static boolean isValidSeatCode(String seatCode, int rows, int columns) {
        if (seatCode.length() < 2) return false;

        char rowChar = seatCode.charAt(0);
        String columnPart = seatCode.substring(1);

        if (rowChar < 'A' || rowChar >= 'A' + rows) return false;

        for (char ch : columnPart.toCharArray()) {
            if (!Character.isDigit(ch)) return false;
        }

        int columnIndex = Integer.parseInt(columnPart);
        return columnIndex >= 1 && columnIndex <= columns;
    }

    static void addBookingHistory(String seatCode) {
        if (bookingCount < bookingHistory.length) {
            bookingHistory[bookingCount][0] = seatCode;
            bookingHistory[bookingCount][1] = Date.from(Instant.now()).toString();
            bookingCount++;
        } else {
            System.out.println("Booking history is full. Cannot store more bookings.");
        }
    }

    static void removeBookingHistory(String seatCode) {
        int indexToRemove = 0;

        for (int i = 0; i < bookingCount; i++) {
            if (bookingHistory[i][0].equals(seatCode)) {
                indexToRemove = i;
                break;
            }
        }

        for (int i = indexToRemove; i < bookingCount; i++) {
            bookingHistory[i] = bookingHistory[i + 1];
        }
        bookingCount--;
    }
}
