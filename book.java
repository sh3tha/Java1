public class book {
    String title;
    String author;
    int numberOfPages;
    boolean isOpen;
    int bookmarkedPage;

    public static void main(String[] args) {
        book myBook = new book("1990", "oman", 300);
        myBook.readPage(10); 
        myBook.open();
        myBook.bookmarkPage(10);
        myBook.close();
    }

    public book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.isOpen = false;
        this.bookmarkedPage = -1;
    }

    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Opened the book \"" + title + "\" by " + author + ".");
        } else {
            System.out.println("The book is already open.");
        }
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Closed the book.");
        } else {
            System.out.println("The book is already closed.");
        }
    }

    public void bookmarkPage(int pageNumber) {
        if (isOpen) {
            if (pageNumber >= 1 && pageNumber <= numberOfPages) {
                bookmarkedPage = pageNumber;
                System.out.println("Bookmarked page " + pageNumber + ".");
            } else {
                System.out.println("Invalid page number to bookmark.");
            }
        } else {
            System.out.println("Cannot bookmark. The book is closed.");
        }
    }

    public void readPage(int pageNumber) {
        if (isOpen) {
            if (pageNumber >= 1 && pageNumber <= numberOfPages) {
                System.out.println("Reading page " + pageNumber + " of \"" + title + "\"...");
            } else {
                System.out.println("Invalid page number.");
            }
        } else {
            System.out.println("Cannot read. The book is closed.");
        }
    }
}
