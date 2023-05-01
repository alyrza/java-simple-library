public class Main {
    public static void main(String[] args) {
        // Create a new library
        Library library = new Library();

        // Add some books to the library
        Book book1 = new Book("testBook", "alireza", "9780061120084");
        Book book2 = new Book("testBook2", "alireza", "9780451524935");
        library.addBook(book1);
        library.addBook(book2);

        // Add some users to the library
        User user1 = new User("ahmad", 12345);
        User user2 = new User("sara", 54321);
        library.addUser(user1);
        library.addUser(user2);

        // Add some admins to the library
        Admin admin1 = new Admin("alireza1", "janesmith@example.com");
        Admin admin2 = new Admin("alireza2", "johnsmith@example.com");
        library.addAdmin(admin1);
        library.addAdmin(admin2);

    }
}