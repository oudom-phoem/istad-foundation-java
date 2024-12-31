package library_manager.model;

import library_manager.interfaces.Reservable;


public class Book extends LibraryItem implements Reservable {
    private final String author;
    private final String genre;
    private boolean isReserved;


    public Book(String itemId, String title ,String author, String genre) {
        super(itemId, title);
        this.author = author;
        this.genre = genre;
        this.isReserved = false;
    }

    @Override
    public void borrowItem() {
        if (isAvailable() && !isReserved) {
            setAvailable(false);
            System.out.println("Book borrowed: " + getTitle());
        } else {
            System.out.println("Book is already borrowed or reserved: " + getTitle());
        }
    }

    @Override
    public void returnItem() {
        setAvailable(true);
        System.out.println("Book returned: " + getTitle());
    }

    @Override
    public void reserveItem(){
        if (isAvailable() && !isReserved) {
            isReserved = true;
            System.out.println("Book reserved: " + getTitle());
        } else {
            System.out.println("Book is already reserved: " + getTitle());
        }

    }

    @Override
    public void cancelReservation(){
        if (isReserved) {
            isReserved = false;
            System.out.println("Book reservation cancelled: " + getTitle());
        } else {
            System.out.println("No reservation exists for this book: " + getTitle());
        }

    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.printf("""
               Author: %s
               Genre: %s
               Reserved: %s
               """, author, genre, (isReserved ? "Yes" : "No"));
    }
}
