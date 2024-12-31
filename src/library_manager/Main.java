package library_manager;

import library_manager.interfaces.Reservable;
import library_manager.model.Book;
import library_manager.model.LibraryItem;
import library_manager.model.Magazine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<LibraryItem> libraryItems = new ArrayList<>();
    public static void main(String[] args) {

        libraryItems.add(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald", "Fiction"));
        libraryItems.add(new Book("B002", "To Kill a Mockingbird", "Harper Lee", "Fiction"));
        libraryItems.add(new Magazine("M001", "Tech Monthly", 42, "December 2024"));
        libraryItems.add(new Magazine("M002", "Health Today", 15, "November 2024"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Search for an item");
            System.out.println("2. Borrow an item");
            System.out.println("3. Return an item");
            System.out.println("4. Reserve a book");
            System.out.println("5. Cancel reservation");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter title or id to search: ");
                    String query = scanner.nextLine();
                    searchItem(query);
                    break;
                case 2:
                    System.out.print("Enter item ID to borrow: ");
                    String borrowId = scanner.nextLine();
                    performOperation(borrowId, "borrow");
                    break;
                case 3:
                    System.out.print("Enter item ID to return: ");
                    String returnId = scanner.nextLine();
                    performOperation(returnId, "return");
                    break;
                case 4:
                    System.out.print("Enter book ID to reserve: ");
                    String reserveId = scanner.nextLine();
                    performOperation(reserveId, "reserve");
                    break;
                case 5:
                    System.out.print("Enter book ID to cancel reserve: ");
                    String cancelId = scanner.nextLine();
                    performOperation(cancelId, "cancel");
                    break;
                case 6:
                    System.out.print("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.print("Invalid choice! Please try again.");

            }
        }
    }

    private static void searchItem(String query) {
        for (LibraryItem item : libraryItems) {
            if (item.getItemId().equalsIgnoreCase(query) || item.getTitle().equalsIgnoreCase(query)) {
                item.displayDetails();
                return;
            }
        }
        System.out.println("Item not found!");
    }

    private static void performOperation(String itemId, String operation) {
        for (LibraryItem item : libraryItems) {
            if (item.getItemId().equalsIgnoreCase(itemId)) {
                switch (operation) {
                    case "borrow":
                        item.borrowItem();
                        break;
                    case "return":
                        item.returnItem();
                        break;
                    case "reserve":
                        if (item instanceof Reservable) {
                            ((Reservable) item).reserveItem();
                        } else {
                            System.out.println("This item cannot be reserved!");
                        }
                        break;
                    case "cancel":
                        if (item instanceof Reservable) {
                            ((Reservable) item).cancelReservation();
                        } else {
                            System.out.println("This item cannot cancel reservation!");
                        }
                        break;
                }
                return;
            }
        }
        System.out.println("Item not found!");
    }
}







