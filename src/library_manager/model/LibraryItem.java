package library_manager.model;

@lombok.Getter
@lombok.Setter

public abstract class LibraryItem {
    private String itemId;
    private String title;
    private boolean isAvailable;

    public LibraryItem(String itemId, String title) {
        this.itemId = itemId;
        this.title = title;
        this.isAvailable = true;
    }

    public abstract void borrowItem();
    public abstract void returnItem();

    public void displayDetails() {
        System.out.printf("""
                Item ID: %s
                Title: %s
                Available: %s
                """, itemId, title, (isAvailable ? "Yes" : "No"));
    }
}
