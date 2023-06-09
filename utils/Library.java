package utils;
import library.*;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;
    private List<Admin> admins;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.admins = new ArrayList<>();
    }

    // Getters for the private fields
    public List<Book> getBooks() {
        return books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    // Methods for adding and removing books, members and admins
    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public void addMember(Member member) {
        this.members.add(member);
    }

    public void removeMember(Member member) {
        this.members.remove(member);
    }

    public void addAdmin(Admin admin) {
        this.admins.add(admin);
    }

    public void removeAdmin(Admin admin) {
        this.admins.remove(admin);
    }
}
