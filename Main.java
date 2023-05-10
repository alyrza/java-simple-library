import library.*;
import utils.Library;

public class Main {
    public static void main(String[] args) {
        // Create a new library
        Library library = new Library();

        // Add some books to the library
        Book book1 = new Book("testBook", "alireza", "9780061120084");
        Book book2 = new Book("testBook2", "alireza", "9780451524935");
        library.addBook(book1);
        library.addBook(book2);

        // Add some members to the library
        Member member1 = new Member("ahmad", "ahmad@gmail.com");
        Member member2 = new Member("sara", "sara@gmail.com");
        library.addMember(member1);
        library.addMember(member2);

        // Add some admins to the library
        Admin admin1 = new Admin("alireza1", "alireza1@example.com");
        Admin admin2 = new Admin("alireza2", "alireza2@example.com");
        library.addAdmin(admin1);
        library.addAdmin(admin2);


    }
}
