package library;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    private static final String FILE_NAME = "books.dat";

    // Add Book
    public void addBook(Book book) {
        try {
            ArrayList<Book> list = getAllBooks();

            for (Book b : list) {
                if (b.getId() == book.getId()) {
                    System.out.println("Book ID already exists!");
                    return;
                }
            }

            list.add(book);

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            oos.writeObject(list);
            oos.close();

            System.out.println("Book added successfully!");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    // Get All Books
    public ArrayList<Book> getAllBooks() {
        ArrayList<Book> list = new ArrayList<>();

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME));
            list = (ArrayList<Book>) ois.readObject();
            ois.close();

        } catch (Exception e) {
            // ignore
        }

        return list;
    }

    // View All Books
    public void viewAllBooks() {
        ArrayList<Book> list = getAllBooks();

        if (list.isEmpty()) {
            System.out.println("No books found.");
            return;
        }

        for (Book b : list) {
            System.out.println(b);
        }
    }

    // Search Book
    public Book searchBookById(int id) {
        ArrayList<Book> list = getAllBooks();

        for (Book b : list) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    // Update Book
    public void updateBook(int id, String newName, String newAuthor) {
        ArrayList<Book> list = getAllBooks();
        boolean found = false;

        for (Book b : list) {
            if (b.getId() == id) {
                b.setName(newName);
                b.setAuthor(newAuthor);
                found = true;
                break;
            }
        }

        if (found) {
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
                oos.writeObject(list);
                oos.close();
                System.out.println("Book updated successfully!");
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        } else {
            System.out.println("Book not found!");
        }
    }

    // Delete Book
    public void deleteBook(int id) {
        ArrayList<Book> list = getAllBooks();
        boolean found = false;

        for (Book b : list) {
            if (b.getId() == id) {
                list.remove(b);
                found = true;
                break;
            }
        }

        if (found) {
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
                oos.writeObject(list);
                oos.close();
                System.out.println("Book deleted successfully!");
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        } else {
            System.out.println("Book not found!");
        }
    }
}