import java.time.LocalDate;

public class Borrowing {
    private User user;
    private Book book;
    private LocalDate startDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

    public Borrowing(User user, Book book, LocalDate startDate, LocalDate dueDate) {
        this.user = user;
        this.book = book;
        this.startDate = startDate;
        this.dueDate = dueDate;
    }

    // Getters and setters for the private fields
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }
}