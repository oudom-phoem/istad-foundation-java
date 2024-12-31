package library_manager.model;

public class Magazine extends LibraryItem {
    private final int issueNumber;
    private final String publicationDate;

    public Magazine(String itemId, String title, int issueNumber, String publicationDate) {
        super(itemId, title);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
    }

    @Override
    public void borrowItem(){
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Magazine borrowed: " + getTitle());
        } else {
            System.out.println("Magazine is already borrowed: " + getTitle());
        }
    }

    @Override
    public void returnItem(){
        setAvailable(true);
        System.out.println("Magazine returned: " + getTitle());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.printf("""
                Issue: %s
                Publication Date: %s
                """, issueNumber, publicationDate);
    }
}
