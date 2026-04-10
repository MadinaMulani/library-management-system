package library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FileHandler fh = new FileHandler();

        while (true) {

            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // buffer clear

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    Book b = new Book(id, name, author);
                    fh.addBook(b);
                    break;

                case 2:
                    fh.viewAllBooks();
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();

                    Book result = fh.searchBookById(searchId);
                    if (result != null) {
                        System.out.println(result);
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new author: ");
                    String newAuthor = sc.nextLine();

                    fh.updateBook(updateId, newName, newAuthor);
                    break;

                case 5:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();

                    fh.deleteBook(deleteId);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}